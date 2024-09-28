import java.util.*;
class HelloWorld {
    static Scanner sc=new Scanner(System.in);
    static  int [] arr=new int[sc.nextInt()];
    public static int max(){
        int m=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static int menulist(){
        System.out.println("1 to enter queries,0 to exit");
        return sc.nextInt();
    }
    public static void query(int i,int j,int k){
        for(int n=i-1;n<j;++n){
            arr[n]+=k;
        }
    }
    public static void main(String[] args) {
       int i;
       while((i=menulist())!=0){
        query(sc.nextInt(),sc.nextInt(),sc.nextInt());
           }
            System.out.println(max());
       }
}
