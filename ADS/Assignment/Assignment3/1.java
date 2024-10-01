import java.util.*;
class HelloWorld {
    static int [] arr=new int[5];
    static int top=-1;
    public boolean isfull(){
        return top == 5;
    }
    public boolean isempty(){
        return top == -1;
    }
    public void push(int i){
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
    public static void main(String[] args) {
       HelloWorld l =new HelloWorld();
       l.push(5);l.push(6);l.push(7);l.push(8);l.disp();
       l.pop();l.disp();
    }
}
