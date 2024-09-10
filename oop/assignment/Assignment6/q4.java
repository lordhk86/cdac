//Write a program to remove duplicate elements from a single-dimensional array of integers.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr=new int[5];
             Q1.accpetRecord(arr);
             Q1.printRecord(arr);
             Q1.unique(arr);
             Q1.printRecord(arr);
             sc.close();
	}
      
	

	private static void unique(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int unique=arr[0];
		for(int rows=1;rows<arr.length;++rows) {
			if(unique==arr[rows]) {
				arr[rows]=0;
			}
			else {
				unique=arr[rows];
			}
			
		}
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
