import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      String s="Hello World";
        String j="";
        int k=0;
        String s1="";
        for(int i=0;i<s.length();++i){
            if(' '==s.charAt(i)){
                k=i;
                break;
            }
        }
        for(int i=k+1;i<s.length();++i){
            j=j+s.charAt(i);
        }
        s1=j+" ";
        for(int i=0;i<k;++i){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
