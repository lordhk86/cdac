class HelloWorld {
    public static void main(String[] args) {
      int count = 5;
    for (int i = 1; i <= count; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                if(j==i)
                System.out.print(i);
                else
                System.out.print(i + "*");
            }
            System.out.println(); 
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(j==i)
                System.out.print(i);
                else
                System.out.print(i + "*");
            }
            System.out.println();
        }
   
}
}
