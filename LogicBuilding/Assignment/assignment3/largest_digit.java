class HelloWorld {
    public static void main(String[] args) {
     int a =4825;
     int next=0;
     int largest = -999;
     while(a!=0){
         next=a%10;
         a/=10;
         if(largest<next){
             largest=next;
         }
     }
     System.out.println(largest);
    
    }
}
