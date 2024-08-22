class HelloWorld {
    public static void main(String[] args) {
        int n = 7;
        int multiple=1;
       for(int i =1;i<=100;i++){
           if(i%n==0){
               multiple=i;
                System.out.println(multiple);
           }
       }
       
    }
} 
/*
7
14
21
28
35
42
49
56
63
70
77
84
91
98
*/
