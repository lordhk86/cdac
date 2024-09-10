// You need to implement a system to manage airplane seat assignments. The airplane has seats arranged in rows and columns. Implement functionalities to:
// Initialize the seating arrangement with a given number of rows and columns.
// Book a seat to mark it as occupied.
// Cancel a booking to mark a seat as available.
// Check seat availability to determine if a specific seat is available.
// Display the current seating chart.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	   int[][] arr;
	   public Q1() {
		   this.arr=new int[5][5];
	   }
	   public int[][] getArr() {
		return arr;
	}
	   public void bookSeat(int a,int b) {
			arr[a][b]=1;		
		}
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Q1 q=new Q1();
           q.bookSeat(sc.nextInt(),sc.nextInt());
           q.cancleSeat(sc.nextInt(),sc.nextInt());
           q.isAvailable(sc.nextInt(),sc.nextInt());
          int[][] arr1= q.getArr();
          System.out.println(Arrays.deepToString(arr1));
             sc.close();
	}
	private void isAvailable(int a,int b) {
		// TODO Auto-generated method stub
		if(arr[a][b]==1)
			System.out.println("it is not avialable ");
		else
			System.out.println("it is avialable");
		
	}
	private void cancleSeat(int a,int b) {
		// TODO Auto-generated method stub
		arr[a][b]=0;
	}

}
