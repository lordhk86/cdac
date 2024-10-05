class HelloWorld {
    public  void qsort(int[] arr,int low,int high){
        if(high>low){
            int pivot = partition(arr,low,high);
            qsort(arr,low,pivot-1);
            qsort(arr,pivot+1,high);
        }
    }
    public int partition(int[] arr,int low,int high){
        int i=low-1; int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    } 
    public void swap(int[]arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        HelloWorld  l =new HelloWorld();
        int[] arr = {123,21,4,66,78,3};
        l.qsort(arr,0,arr.length-1);
        for(int element:arr){
            System.out.println(element);
        }
    }
}
