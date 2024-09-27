import java.util.*;
class HelloWorld {
    static int top=-1;
     static char[] arr=new char[10];
     static final int size=10;
    public   boolean push(char i){
        if(top<size){
            arr[++top]=i;
            return true;
        }
        else return false;
    }
    public  char pop(){
        if(!isEmpty()){
            return arr[top--];
        }
        return ' ';
    }
    public  int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        return -1;
    }
    public  boolean isEmpty(){
        if(top<0){
            return true;
        }
        return false;
    }
    public void disp(){
        if(!isEmpty()){
            
        }
    }
    public static void main(String[] args) {
      HelloWorld a=new HelloWorld();
      String s="CDAC";
      for(int i=0;i<s.length();++i){
          a.push(s.charAt(i));
      }
      String s1="";
      for(int i=0;i<s.length();++i){
       s1 = s1+""+a.pop();
      }
      System.out.println(s1);
    }
}
