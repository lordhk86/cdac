class HelloWorld {
    public static void main(String[] args) {
        int nums=0;
        int count=0;
     for(int i=1;i<=9;i++){
         nums=0;
         for(int k=0;k<=9-i;k++){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
                 nums=nums*10+j;
             
         }
         System.out.print(nums+"x8+"+i+"=");
         System.out.println(nums*8+i);
     }
    }
}
