//Write a program to find the intersection of two single-dimensional arrays.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr=new int[5];
             int[] arr1=new int[] {11,12,13,14,15};
             Q1.accpetRecord(arr);
             int[] arr2=Q1.intersection(arr,arr1);
             Q1.printRecord(arr2);
             sc.close();
	}
      
	




	private static int[] intersection(int[] arr,int[] arr1) {
		// TODO Auto-generated method stub
		int count=0;
		int[] arr2=new int[arr.length];
		 for(int rows1=0;rows1<arr.length;++rows1) {
			 for(int rows=0;rows<arr1.length;++rows) {
				 if(arr[rows1]==arr1[rows]) {
					 arr2[count]=arr[rows1];
					 count++;
				 }
			 }
		 }
		 return arr2;
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
