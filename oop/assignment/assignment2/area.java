import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1 circle ,2 square,3 reactangle,4 triangle ");
    int x=sc.nextInt();
        switch(x){
           case 1:int r=sc.nextInt();
               System.out.println(2*3.14*r);
               break;
           case 2:
               int side = sc.nextInt();
               System.out.println(side*side);
               break;
           case 3:int l = sc.nextInt();int b=sc.nextInt();
           System.out.println(l*b);
           case 4:int c=sc.nextInt();int h=sc.nextInt();
           System.out.println(.5*c*h);
           break;
        }
        sc.close();
    }
}
