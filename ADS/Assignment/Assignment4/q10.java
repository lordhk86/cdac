class Node {
    int data;Node next;
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
       l.insert(10);l.insert(20);l.insert(30);l.insert(40);
       l.display();l.rotate(2);l.display();
    }
}
