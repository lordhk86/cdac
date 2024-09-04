class HelloWorld {
    public static void main(String[] args) {
        char a='A';
        for(int i=0;i<6;i++){
            for(int j=0;j<6-i;j++){
                System.out.print(" ");
            }
            for(int z =0;z<i*2-1;z++){
            System.out.print(a);
                if(a=='Y')
                    System.out.print(++a);
            a++;
            }
        System.out.println("");     
        }
       
    }
}
