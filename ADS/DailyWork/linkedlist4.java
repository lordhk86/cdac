class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head=null;
    Node tail=null;
    public void insert(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void insertAfter(int data,int i){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            insert(data);
        }
        else{
        Node temp=head;
        while(temp.data!=i){
            temp=temp.next;
        }
           newNode.next=temp.next;
        temp.next=newNode;
        }
    }
    public void delIndex(int i){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        else{
        if(i==0){
            head=head.next;
        }
        else {
            Node temp=head;Node prev=null;
            for(int j=0;temp!=null&&j<i;++j){
                prev=temp;
                temp=temp.next;
            }
            if(temp==null) return;
            prev.next=temp.next;
            if(temp.next==null) tail=prev;
        }
    }
}
    public void delAfter(int data){
        Node temp=head;
        while(temp.data!=data){
            temp=temp.next;
        }
        Node n=temp.next;
        temp.next=n.next;
    }
    public void delFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.next;
        }
    }
    public void delLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void display(){
        Node temp=head;
        int count =0;
        while(temp!=null){
            System.out.println(temp.data);
            count++;
            temp=temp.next;
        }
        System.out.println("number of elements in the list is "+count);
    }
    public int recursive(Node n){
        if(n.next==null){
            return 1;
        }
        return 1+recursive(n.next);
    }
    public void del(int data){
         if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        if(data==temp.data){
            head=temp.next;
        }
        else{
           Node prev=null;
           while(temp!=null&&temp.data!=data){
               prev=temp;
               temp=temp.next;
           }
           if(temp==null){
               return;
           }
           else{
           prev.next=temp.next;
           if(temp.next==null){
                tail=prev; 
             }
           }
        }
    }
    public boolean search(int data){
        Node temp=head;
        if(temp.data==data) return true;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void middle(){
        Node ptr1=head;Node ptr2=head;
        while(ptr2!=null&&ptr1!=null){
             ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        System.out.println("the middle element is :"+ptr1.data);
    }
    public void reverse(){
        Node temp=head;
        Node prev=null;
        Node n=null;
        while(temp!=null){
            n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        head = prev;
    }
}
public class HelloWorld {
   
    public static void main(String[] args) {
       LinkedList l=new LinkedList();
       l.insert(10);
         l.insert(20);
           l.insert(30);
             l.insert(40);
               l.insert(50);
               l.insertAfter(35,30);
    //   l.display();
    //   l.reverse();
    l.middle();
      l.display();
     // System.out.println(l.recursive(l.head));
      //System.out.println(l.search(40));
    }
}
