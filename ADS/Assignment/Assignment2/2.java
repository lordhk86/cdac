class HelloWorld {
    public static int rmvd(int[] arr){
        if(arr.length==0){
            return 0;
        } 
        int temp=0;
        int count=0;
        int [] arr1=new int[arr.length];
        for(int i=0;i<arr.length-1;++i){
            temp=arr[i];
            if(temp!=arr[i+1]){
                arr[count]=arr[i];
                count++;
            }
        }
        return ++count;
    }
    public static void main(String[] args) {
        int [] arr= {1,1,2};
        System.out.println(rmvd(arr));
    }
}
