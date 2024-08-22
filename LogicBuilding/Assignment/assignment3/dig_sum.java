class HelloWorld {
    public static void main(String[] args) {
     int dig=9876;
     int sum=0;
     while(dig!=0){
         sum+=dig%10;
         dig/=10;
     }
     
     System.out.println(sum);
    
    }
} // 30
