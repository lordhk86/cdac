public class HelloWorld {
    static int[] arr={10,3,3,5,2,4,1};
    public static  void ssort(){
        int min=0;int temp=0;
        for(int i=0;i<arr.length-1;++i){
            min=i;
            for(int j=i+1;j<arr.length;++j){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
     ssort();//selection sort
     for(int element:arr){
         System.out.println(element);
     }
    }
}
