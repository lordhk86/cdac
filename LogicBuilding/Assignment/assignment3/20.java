class HelloWorld {
    public static void main(String[] args) {
      int count = 5;
         for (int i =1; i<=count; i++) {
             for(int j=1;j<=i;j++){
                 if(j==i)
                 System.out.print(count-j+1);
                 else
                 System.out.print(count-j+1+"*");
             }
             System.out.println();
        }
    
    
          
        }
}
