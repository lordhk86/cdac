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
    public void rem(){// this the function to remove duplicate elements from the array we are using tnree pointers next prev and current 
      Node temp=head;Node r=null;Node s=null;
      while(temp.next!=null&&temp!=null){
          s=temp.next;
          if(s.data==temp.data){
              if(r==null) head =s ;
              else{
                  r.next=s;
              }
          }else{
              r=temp;
          }
          temp=s;
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
    public void add(Node n,Node s){
        if(n==null){
            return ; 
        }
        if(s == null){
            return ;
        }
        else{
            Node p=null; int carry=0;int g=0;
            while(n!=null&&s!=null){
                if(n.data+s.data+carry>9){
                    if(n.next==null){
                          g=carry;
                    carry=(n.data+s.data+carry)/10;
                    n.data=(n.data+s.data+g)%10;
                    Node o=new Node(carry);
                    n.next=o;
                    }
                    else{
                    g=carry;
                    carry=(n.data+s.data+carry)/10;
                    n.data=(n.data+s.data+g)%10;}
                }
                else{
                    n.data+=s.data+carry;
                }          
                n=n.next;s=s.next;
            }
        }
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();LinkedList s=new LinkedList();s.insert(9);s.insert(9);s.insert(9);
        l.insert(1);l.insert(0); l.insert(0);s.add(s.head,l.head);s.display();
      
    }
}
