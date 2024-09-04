class HelloWorld {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=0;j<6-i;j++){
                System.out.print(" ");
            }
            for(int z =0;z<i;z++){
                
            if(z==0||z==i-1||i==6){
            System.out.print("* ");}
            else 
            System.out.print("  ");
                
            }
        System.out.println("");     
        }
       
    }
}
