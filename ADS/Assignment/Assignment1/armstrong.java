class HelloWorld {
  public static int ispal(int number){
      if(number==0){
          return 0;
      }
      int digit=number%10;
      return (int)Math.pow(digit,3)+ispal(number/10);
  }
    public static void main(String[] args) {
        System.out.println(ispal(153)==153);
    }
}
