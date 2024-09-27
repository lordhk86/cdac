import java.util.*;
class HelloWorld {
    public static void print(int n){
        if(n==1){
            System.out.print("*");
            return;
        }
       print(n-1);
       System.out.print("*");
    }
    public static void main(String[] args) {
        for(int i=1;i<=3;++i){
            print(i);
            System.out.println("");
        }
}
}
/* output
*
**
***
*/
