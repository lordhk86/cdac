//Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to get input from the terminal into the array and another method named printRecord to print the state of the array to the terminal.
package ass7q1;


import java.util.Scanner;

public class Q1 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr=new int[3];
             Q1.accpetRecord(arr);
             Q1.printRecord(arr);
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
