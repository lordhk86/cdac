class HelloWorld {
  public static boolean ispal(String s){
     if(s.length()==1)
              return true;
     if(s.charAt(0)!=s.charAt(s.length()-1))
         return false;
     return ispal(s.substring(1,s.length()-1));
  }
    public static void main(String[] args) {
        System.out.println(ispal("abac"));
    }
}
