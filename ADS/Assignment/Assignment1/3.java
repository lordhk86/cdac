class HelloWorld {
    public static double sum(int a,double s,int i){
        if(i>a){
            return s;
        }
        if(i%2==0)
         s-=1.0/i;
        else
        s+=1.0/i;
        return sum(a,s,i+1);
    }
    public static void main(String[] args) {
     System.out.println(sum(3,0.0,1));
    }
}
