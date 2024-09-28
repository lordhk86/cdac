class Node{
    int data;
    Node next=null;
}
class LinkedList{
    Node head=null;
    public void insertFirst(int data){
        Node newNode= new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public  void insert(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null)
            head =newNode;
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void insertEnd(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            head=newNode;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        }
    }
    public  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertBt(int data,int i){
        Node newNode=new Node();
        newNode.data=data;
           if(head==null){
               head=newNode;   
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
}
public class Main {
    public static void main(String[] args) {
     LinkedList l=new LinkedList();
     l.insert(10);
     l.insert(20);
     l.insert(30);
     l.insertEnd(40);
     l.insertFirst(5);
     l.insertBt(35,30);
     l.print();
    }
}
