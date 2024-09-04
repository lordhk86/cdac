class HelloWorld {
    public static void main(String[] args) {
        int n=7;
        int count =0;
        if(n%21=0)
        for(int i=1;i<=(n/2+1);i++){
            count=i;
          for(int j=1;j<=i;j++){
          if(j==1)
            System.out.print(count+" ");
            else{
                count+=i;
                System.out.print(count+" ");
            }
          }
          System.out.println();
        }
        for(int i=(n/2+2);i<=n;i++){
            count=i;
            for(int j=0;j<=n-i;j++){
                if(j==0){
                System.out.print(count+" ");}
                else{
                count+=i;
                System.out.print(count+" ");}
            }
            System.out.println();
        }
        
   
    }
}
