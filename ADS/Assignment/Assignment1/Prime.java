class HelloWorld {
    public static boolean Prime(int a,int i){
        if(i==a){
            return true;
        }
     if(a%i==0){
         return false;}
   return  Prime(a,i+1);
    }
    public static void main(String[] args) {
       System.out.println(Prime(4,2));
    }
}
