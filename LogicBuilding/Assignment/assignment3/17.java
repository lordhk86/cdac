class HelloWorld {
    public static void main(String[] args) {
      int count = 5;
    for (int i = 0; i <count; i++) {
        if(i>0){
        for(int j =1;j<=i;j++)
        System.out.print(" ");
        }
        for(int j=1;j<=count-i;j++){
            System.out.print("*");
        }
             System.out.println();
        }
          
        }
}
