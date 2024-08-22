public class leap_year{
	public static void main(String args[]){
		int year =1764;
			if(year==1900){
				System.out.println("this is not a leap year");
			}
			else{
			  if (year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("this is a leap yaer");
				}
				else{
					System.out.println("This is not a leap year");
				}
			}
			else{
				System.out.println("This is  a leap year");
			}
			  }
			else{
				System.out.println("This is not a leap year");
			}
			}
	}
	
}