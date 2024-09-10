//Write a program to find the missing number in an array of integers ranging from 1 to N.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr=new int[5];
             Q1.accpetRecord(arr);
             Q1.missing(arr);
             //Q1.printRecord(arr);
             sc.close();
	}


	private static void missing(int[] arr) {
		// TODO Auto-generated method stub
		int i=1;
		Arrays.sort(arr);
	for(int elements:arr) {
		if(elements!=i) {
			System.out.println(i);
		}
		i++;
	}
	}


//	private static void printRecord(int[] arr) {
//		// TODO Auto-generated method stub
//		for(int element : arr) {
//			System.out.println(element);
//		}
//	}

	private static void accpetRecord(int[] arr) {
		// TODO Auto-generated method stub
		for(int rows=0;rows<arr.length;++rows) {
			arr[rows]=sc.nextInt();
		}
	}

}
