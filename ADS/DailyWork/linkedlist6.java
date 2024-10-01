class Node{
    int data; Node prev,next;
}
class LinkedList{
    Node head=null;Node tail=null;
    public void insertFirst(int data){
        Node n=new Node();n.data=data;
        if(head==null){
            head=n;tail=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
    public void insert(int data){
        Node n=new Node();n.data=data;
        if(head==null){
            head =n;tail=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
            tail=n;
        }
    }
    public void insertAfter(Node n,int data){
        if(n==null) { System.out.println("node dosenot exists");
            return ;
        }
        else{
            Node s=new Node();s.data=data;
            Node temp=head;
            while(temp!=n&& temp!=null){
                temp=temp.next;
            }
            if(temp == null) return ;
            s.next=n.next;
            s.prev=n;
            n.next=s;
            if(s.next!=null)
                s.next.prev=s;
        }
    }
    public Node getNode(int data){
        Node temp=head;
        while(temp.data!=data){
            temp=temp.next;
        }
        return temp;
    }
    public boolean delNode(Node n){
        if(head == null  ) {
            System.out.println("list is empty");
            return false;
        }
        else{
            Node t =  head;
            if(n==t&& n!=null){
                head=head.next;
                head.prev=null;
                return true;
            }
            else{
                while(t!=n&&t!=null){
                    t=t.next;
                }
                if(t==null) return false;
                t.prev.next=t.next;
                if(t.next!=null)
                 t.next.prev=t.prev;
                return true;
            }
            
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");temp=temp.next;
        }
        System.out.println("");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
       LinkedList l=new LinkedList();
       l.insert(10);l.insert(20);l.insert(30);l.insert(40);l.insert(50);l.insertFirst(5);
       l.insertAfter(l.getNode(30),35);l.delNode(l.getNode(50));l.display();
    }
}
