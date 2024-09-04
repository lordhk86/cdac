class HelloWorld {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
             for(int z=0;z<=n-i;z++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
   
    }
}
