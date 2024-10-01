import java.util.*;
class HelloWorld {
    static char [] arr=new char[5];
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
    public static void main(String[] args) {
       HelloWorld l =new HelloWorld();
       l.push('h');l.push('e');l.push('l');l.push('l');l.push('o');l.pop();l.pop();l.pop();l.pop();l.pop();
    }
}
