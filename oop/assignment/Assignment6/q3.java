//Write a program to find the maximum and minimum values in a single-dimensional array of integers.
package ass7q1;
import java.util.Scanner;

public class Q1 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr=new int[3];
             Q1.accpetRecord(arr);
             Q1.printRecord(arr);
             int max=Q1.max(arr);
             System.out.println(max);
             sc.close();
	}
      
	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int rows=0;rows<arr.length;++rows) {
			if(arr[rows]>max) {
				max=arr[rows];
			}
		}
		return max;
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
