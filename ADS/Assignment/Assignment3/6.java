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
            arr[rear++]=data;
            count++;
        }
    }
    public void dequeue(){
        if(isEmpty()) return ;
        System.out.println(arr[front++]);
        System.out.println("");
        count--;
    }
    public void display(){
        for(int i=front;i<rear;++i){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
    HelloWorld l=new HelloWorld();
    l.enqueue(10);l.enqueue(20);l.enqueue(30);l.enqueue(40);l.dequeue();l.display();
    }
}
