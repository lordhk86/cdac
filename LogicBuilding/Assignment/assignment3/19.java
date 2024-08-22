class HelloWorld {
    public static void main(String[] args) {
      int count = 5;
         for (int i =1; i<=count; i++) {
             for(int j=1;j<=i;j++){
                 if(j==i)
                 System.out.print(j);
                 else
                 System.out.print(j+"*");
             }
             System.out.println();
        }
    
    
          
        }
}
