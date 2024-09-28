import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr={7,8,9};
        int temp=0;
        int count=0;
         for(int i=arr.length-1;i>=arr.length/2;i--){
             temp=arr[i];
             arr[i]=arr[count];
             arr[count]=temp;
             count++;
         }
         System.out.println(Arrays.toString(arr));
    }
}//reverse array in place 
