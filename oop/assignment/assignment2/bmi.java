class HelloWorld {
    public static void main(String[] args) {
        double weight=70;
        double height=178;
        double bmi= (weight/(height*height))*10000;
        if(bmi<=20)
        System.out.println("underwieght");
        else if(bmi<=25.0){
            System.out.println("normal");
            
        }
        else if(bmi<=29.0)
        System.out.println("overwight");
        else if (bmi > 29)
        System.out.println("obesity");
    }
}
