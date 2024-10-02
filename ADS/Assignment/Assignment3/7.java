class HelloWorld{
    static int arr[]=new int[6];
   int front=0;
    int rear=0;
    int count=0;
    public boolean isFull(){
        return count==6;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void enqueue(int data){
        if(isFull()) return ;
        else{
            arr[rear]=data;
            rear=(rear+1)%6;
            count++;
        }
    }
    public void dequeue(){
        if(isEmpty()) return ;
        System.out.println(arr[front]);
        front=(front+1)%6;
        System.out.println("");
        count--;
    }
    public void display(){
        for(int i=0;i<count;++i){
            System.out.println(arr[(front+i)%6]);
        }
    }
    public static void main(String[] args){
    HelloWorld l=new HelloWorld();
    l.enqueue(10);l.enqueue(20);l.enqueue(30);l.enqueue(40);l.dequeue();l.enqueue(50);l.display();
    }
}
