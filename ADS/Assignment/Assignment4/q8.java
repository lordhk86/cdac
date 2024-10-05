class Node {
    int data;Node next;Node prev;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head =null;
    public void insert(int data){
        Node n=new Node (data);
        if(head == null) head =n;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
        }
    }
    public void delete(int data){
        if(head == null) return ;
        else if(head.data == data){
            head=head.next;
            head.prev=null;
        }
        else{
            Node temp=head;
            while(temp!=null&&temp.data!=data){
                temp=temp.next;
            }
            if(temp==null){
                return ;
            }
            if(temp.next!=null){
            temp.next.prev=temp.prev;
            }
            temp.prev.next=temp.next;
            
        }
    }
    public void rotate(int d){
        Node temp=head;;Node r=null;int t=0;
        for(int i=0;i<d;++i){
            temp=head;
            t=temp.data;
        while(temp.next!=null){
            r=temp.next;
            temp.data=r.data;
            temp=r;
        }
        temp.data=t;
      }
    }
    public void reverse(){
        if(head == null){
            return ;
        }
        else{
            Node temp =head;Node r= null;Node p=null;
            while(temp!=null){
                r=temp.next;
                temp.next=p;
                temp.prev=r;
                p=temp;
                temp=r;
            }
            head=p;
        }
    }
    public void display(){
        Node temp=head;Node p=null;
        while(temp!=null){
            p=temp;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.prev;
        }
        System.out.println("");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
       LinkedList l=new LinkedList();
       l.insert(10);l.insert(20);l.insert(30);l.insert(40);
       l.reverse();
       l.display();
    }
}
