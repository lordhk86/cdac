import java.util.*;
class HelloWorld {
    static char [] arr=new char[6];
    static int top=-1;
    public boolean isfull(){
        return top == 5;
    }
    public boolean isempty(){
        return top == -1;
    }
    public void push(char i){
        if(isfull()){
            System.out.println("stack is full");
            return;
        }
        else{
            arr[++top]=i;
        }
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return ;
        }
        else{
            System.out.println("the poped element is :"+arr[top--]);
        }
    }
    public void disp(){
        for(int i=0;i<=top;++i){
            System.out.println(arr[i]);
        }
    }
    public boolean isBalanced(String s){
         for(int i=0;i<s.length();++i){
             char c=s.charAt(i);
             if(c=='['||c=='{'||c=='(')
           push(c);
           else{
               if(isempty()) return false;
               char topchar= arr[top];
               if( c == ')' && topchar!='('||c=='}'&&topchar!='{'||c==']'&&topchar!='[')
               return false;
               pop();
           }
       }
       
     return isempty();   
    }
    public char match(char a){
        if(a=='(') return ')';
        if(a=='{') return '}';
        if(a== '[') return ']';
        return ' ';
    }
    public static void main(String[] args) {
       HelloWorld l =new HelloWorld();
     String   s="[{()}]";
       l.disp();
       System.out.println(l.isBalanced(s));
    }
}
