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
            if(temp.next==null){
                tail=prev; 
             }
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
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
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
             l.delIndex(0);
             l.delIndex(2);
             l.delIndex(3);
      l.display();
    }
}
