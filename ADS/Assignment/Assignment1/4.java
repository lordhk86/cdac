class HelloWorld {
    public static void sum(int a,int i){
        if(i==1){
             System.out.println(a+"x"+i+"="+a);
             return ;
        }
        System.out.println(a+"x"+i+"="+a*i);
         sum(a,i-1);
    }
    public static void main(String[] args) {
     sum(3,10);
    }
}
