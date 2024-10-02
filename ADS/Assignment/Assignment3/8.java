import java.util.*;
class HelloWorld{
    static int arr[]=new int[6];
    int top=-1;int top1=-1;
   static int arr1[]=new int[6];
    public boolean isFull(int t){
        return t==6;
    }
    public boolean isEmpty(int t){
        return t==-1;
    }
    public void push(int i,int j){
       
        if(j==1){
             if(isFull(top)) return;
         arr[++top]=i;}
        else{
             if(isFull(top1)) return;
            arr1[++top1]=i;
        }
    }
    public int pop(int i){
       
        if(i==1){
             if(isEmpty(top)) return -1;
            return arr[top--];
        }
        else{
             if(isEmpty(top1)) return -1;
            return arr1[top1--];
        }
    }
    public void enqueue(int data){
        if(isFull(top)) return;
         else{
             push(data,1);
         }
    }
    public void dequeue(){
            push(pop(1),2);
            if(isEmpty(top1)) return;
         System.out.println(pop(2));
        
    }
    // public void display(){
    //     for(int i=0;i<count;++i){
    //         System.out.println(arr[(front+i)%6]);
    //     }
    // }
    public static void main(String[] args){
    HelloWorld l=new HelloWorld();
    l.enqueue(10);l.enqueue(20);l.enqueue(30);l.enqueue(40);l.dequeue();System.out.println(Arrays.toString(l.arr1));
    }
}
