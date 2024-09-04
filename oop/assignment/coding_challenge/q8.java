class HelloWorld {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            if(i==0){
               System.out.println("0");
            }
           for(int j=n-i;j<=n;j++){
               if(j==n)
               System.out.print(j+"0");
               else 
               System.out.print(j);
           }
           for(int k=n;k>=n-i;k--)
           System.out.print(k);
            System.out.println();
        }
   
    }
}
