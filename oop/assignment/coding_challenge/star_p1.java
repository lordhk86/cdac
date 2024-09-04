class HelloWorld {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6-i-1;j++){
                System.out.print(" ");
            }
            for(int z =0;z<=i;z++){
                
            if(z==0||z==i||i==5){
            System.out.print("* ");}
            else 
            System.out.print("  ");
                
            }
        System.out.println("");     
        }
       
    }
}
