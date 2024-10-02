class HelloWorld{
    static int arr[]=new int[6];
    static int top=-1;
    public void push(int data){
        if(top==6-1) return;
        else {
            arr[++top]=data;
        }
    }
    public int  pop(){
        if(top==-1){
            return -1;
        }
        else{
            return arr[top--];
        }
    }
    public int cal(String s){
        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int l=c-'0';
                   push(l);}
            else {
                if(top<1) return -1;
                int k=pop();int j=pop();
                switch(c){
                    case '+': push(k+j);break;
                    case '-': push(k-j);break;
                    case '*': push(k*j);break;
                    case '/': if(j>0) push(i/j);break;
                }
            }
        }
        if(top!=0){
            return -1;
        }
        return pop();
    }
    public void peek(){
        if(top==-1) return;
        System.out.println(arr[top]);
    }
    public static void main(String[] args){
       HelloWorld l=new HelloWorld();
     String s="53+2*";
    System.out.println(l.cal(s));
    }
}
