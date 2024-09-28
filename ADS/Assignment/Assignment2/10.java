import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      int d=2;
      int[] arr={1,2,3,4,5};
      int temp=0;
      int count=0;
      for(int i=1;i<=d;++i){
          temp=arr[0];
         for(int j=0;j<arr.length-1;++j){
             arr[j]=arr[j+1];
         }
         arr[arr.length-1]=temp;
      }
        System.out.println(Arrays.toString(arr));
    }
}
