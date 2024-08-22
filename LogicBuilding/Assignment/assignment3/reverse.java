class HelloWorld {
    public static void main(String[] args) {
        int n = 1234;
        int multiple=1;
        int result=0;
      while(n!=0){
          multiple = n%10;
          result = result*10 + multiple;
          n=n/10;
      }
      System.out.println(result);
       
    }
} // 4321 is the output 
