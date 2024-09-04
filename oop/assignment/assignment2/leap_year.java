class HelloWorld {
    public static void main(String[] args) {
        int year=1900;
        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.println("it is a leap year");
        }
            else{
            System.out.println("it is not a leap year");
           }
    }
}
class HelloWorld1 {
    public static void main(String[] args) {
        int year=1900;
        int temp=year%100;
        int count=0;
        if(temp==0){
            count=1;
        }
        switch(count){
            case 1:if(year%400==0){
                System.out.println("it is a leap year");
            }
            else{
                System.out.println("it is not a leap year");
            }
            break;
            case 0:
                if(year%4==0)
                System.out.println("it is a leap year");
                else
                System.out.println("it is not a leap year");
            break;
        }
    }
}
