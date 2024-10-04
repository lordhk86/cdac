public class HelloWorld {
    static int[] arr={10,3,3,5,2,4,1};
    public static  void isort(){
       
        for(int i=1;i<arr.length;++i){
                int min=arr[i];int j=i-1;
                 while(j>=0&&arr[j]>min){
                     arr[j+1]=arr[j];j=j-1;
                 }
                 arr[j+1]=min;
        }
    }
    public static void main(String[] args) {
     isort();//selection sort
     for(int element:arr){
         System.out.println(element);
     }
    }
}
