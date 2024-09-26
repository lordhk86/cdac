class HelloWorld {
  public static int ispal(int n){
     if(n==1){
         return n;
     }
     System.out.println(n);
     return n+ispal(n-1);
  }
    public static void main(String[] args) {
        System.out.println(ispal(10));
    }
}
