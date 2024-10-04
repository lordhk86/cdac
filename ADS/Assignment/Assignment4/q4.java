class Node{
    int data;Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head=null;
    public void insert(int data){
        Node n=new Node (data);
        if(head==null){
            head =n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public Node merge(Node n,Node m){
         if(n==null){
             return n;
         }
         if(m==null){
             return m;
         }
         if(n.data>m.data){
             m.next=merge(n,m.next);
             return m;
         }
         else{
             n.next=merge(n.next,m);
             return n;
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
        LinkedList l=new LinkedList();LinkedList s=new LinkedList();
        l.insert(1); l.insert(3); l.insert(5);
        s.insert(2);s.insert(4);s.insert(6);
        l.display();s.display();
        LinkedList h=new LinkedList();
        h.head=l.merge(l.head,s.head);h.display();
    }
}
