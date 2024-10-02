class HelloWorld{
    static char arr[]=new char[6];
    static int top=-1;
    public void push(char data){
        if(top==6-1) return;
        else {
            arr[++top]=data;
        }
    }
    public char  pop(){
        if(top==-1){
            return ' ';
        }
        else{
            return arr[top--];
        }
    }
    public void post(String s){
        String s1="";
        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            if(Character.isDigit(c))
                s1+=c;
             switch(c){
                 case '+':
                 case '-': while(top!=-1&&getp(c)<=getp(peek())){
                         s1+=pop();
                 }
                 push(c);break;
                 case '*':
                 case '/':while(top!=-1&&getp(c)<=getp(peek())){
                         s1+=pop();
                 }
                 push(c);break;
                 
             }
        }
        while(top!=-1){
            s1+=pop();
        }
        System.out.println(s1);
    }
    public int getp(char c){
        if(c=='+'||c=='-') return 1;
        if(c=='*'||c=='/') return 2;
        return -1;
    }
   // public int cal(String s){
     //   for(int i=0;i<s.length();++i){
       //     char c=s.charAt(i);
        //     if(Character.isDigit(c)){
        //         int l=c-'0';
        //           push(l);}
        //     else {
        //         if(top<1) return -1;
        //         int k=pop();int j=pop();
        //         switch(c){
        //             case '+': push(k+j);break;
        //             case '-': push(k-j);break;
        //             case '*': push(k*j);break;
        //             case '/': if(j>0) push(i/j);break;
        //         }
        //     }
        // }
    //     if(top!=0){
    //         return -1;
    //     }
    //     return pop();
    // }
    public char peek(){
        if(top==-1) return ' ';
        return arr[top];
    }
    public static void main(String[] args){
       HelloWorld l=new HelloWorld();
     String s="5+3*2";l.post(s);
   // System.out.println(l.cal(s));
    }
}
