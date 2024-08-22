 public static void main(String[] args) {
      int count = 4;
         for (int i = count; i >=0; i--) {
        for(int j =0;j<count-i;j++)
        System.out.print(" ");
        for(int j=0;j<i*2;j++){
            System.out.print("*");
        }
             System.out.println();
            
        
        }
    for (int i = 0; i <=count; i++) {
        for(int j =0;j<=count-i-1;j++)
        System.out.print(" ");
        for(int j=0;j<=i*2;j++){
            System.out.print("*");
        }
             System.out.println();
            
        
        }
     
    
          
        }
}
