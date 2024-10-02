class Node{
    int data;Node right;Node left;
    public Node(int data){
        this.data=data;
    }
}
class Tree{
Tree(){
    head=null;
}
Tree(int data){
    head = new Node(data);
    System.out.println("1");
}
    Node head=null;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.left!=null||temp.right!=null){
              if(temp.left!=null) temp=temp.left;
              if(temp.right!=null)  temp=temp.right;
            }
            if(temp.left==null)
               temp.left=n;
            else temp.right=n;
        }
    }
   public void display(){
       Node temp=head;
         while(temp.left!=null||temp.right!=null){
             System.out.println(temp.data);
              if(temp.left!=null) temp=temp.left;
              if(temp.right!=null)  temp=temp.right;
            }
             System.out.println(temp.data);
   }
  
}
public class HelloWorld{
      public static void main(String[] args) {
      Tree t = new Tree();
      t.insert(10); t.insert(20); t.insert(30); t.insert(40);t.insert(50);t.insert(60);
      t.display();
    }
}
