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
    public int m(int l){
        Node temp=head;Node n=head;
        for(int i=0;i<l;++i){
            if(n==null) return -1; 
            n=n.next;
        }
        while(n.next!=null){
            n=n.next;
            temp=temp.next;
        }
        return temp.data;
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
        LinkedList l=new LinkedList();
        l.insert(1); l.insert(3); l.insert(5);l.insert(7);l.display();System.out.println(l.m(2));
      
    }
}
