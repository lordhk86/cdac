import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
     int n=-9876;
     int temp=0;
     int sum=0;
     while(n!=0){
         temp=n%10;
         sum=sum*10+temp;
         n=n/10;
     }
        System.out.println(sum);
    }
}
