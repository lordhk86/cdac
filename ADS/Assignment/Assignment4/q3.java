class Node{
    int data;Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head=null;Node tail=null;
    public void insert(int data){
        Node n=new Node(data);
        if(head ==null){
            head=n;tail=n;
            n.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            tail=n;
            tail.next=head;
        }
    }
    public void del(int data){
        if(head==null) return;
        else{
            Node temp=head; Node p=null;
            if(temp.data == data) {
                head=head.next;
            }
            while(temp!=null&&temp.data!=data){
               p =temp;
                temp=temp.next;
            } 
            if(temp==null) return ;
            p.next=temp.next;
        }
    }
    public boolean search(int data){
        if(head == null ) return false;
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.data==data) return true;
                temp=temp.next;
            }
            return false;
        }
    }
    public boolean cir(){
        if(head == null ) return false;
        else{
            Node temp=head;Node p=head;
            while(p!=null&&p.next!=null){
                temp=temp.next;p=p.next.next;
                if(temp==p){
                    return true;
                }
            }
            return false;
        }
    }
    public void reverse(){
        if(head == null) return ;
        else{
            Node temp=head;Node p = null ; Node r=null;
            while(temp!=null){
                r=temp.next;
                temp.next=p;
                p=temp;
                temp=r;
            }
            head=p;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);l.insert(20);l.insert(30);l.insert(40);
       // l.display(); l
      System.out.println(l.cir());
    }
}
