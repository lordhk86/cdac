class HelloWorld {
    public static void main(String[] args) {
        int month=11;
        int count=0;
        if(month>=4&&month<=6)
        count=1;
        else if (month>=7&&month<=9)
        count=2;
        else if (month>9&&month<=12)
        count=3;
        switch(count){
            case 0:System.out.println("the season is Autumn");
            break;
            case 1:System.out.println("the season is summer");
            break;
            case 2:System.out.println("the season is spring");
            break;
            case 3:
                System.out.println("the season is winter");
                break;
        }
    }
}
