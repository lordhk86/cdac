class HelloWorld {
    public static void main(String[] args) {
        int a= 0;
        int b=1;
        int next=0;
        System.out.println(a);
        System.out.println(b);
        for(int i =1 ; i <=21;i++){
            next=a+b;
           a=b;
           b=next;
           System.out.println(next);
            
        }
    }
} /*
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377 */
