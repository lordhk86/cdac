//Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	   int[] arr;
	   public Q1() {
		   this.arr=new int[5];
	   }
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Q1 q=new Q1();
             Q1.accpetRecord(q.arr);
             Q1.printRecord(q.arr);
             sc.close();
	}



	private static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
		for(int element : arr) {
			System.out.println(element);
		}
	}

	private static void accpetRecord(int[] arr) {
		// TODO Auto-generated method stub
		for(int rows=0;rows<arr.length;++rows) {
			arr[rows]=sc.nextInt();
		}
	}

}
