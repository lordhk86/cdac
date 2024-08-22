class HelloWorld {
    public static void main(String[] args) {
      int count = 5;
    for (int i = 0; i < count; i++) {
           for(int j=0;j<count-i-1;j++){
           System.out.print(" ");
           }
           for(int j=0;j<=i;j++)
            System.out.print("*");
             System.out.println();
        }
          
        }
   
}
