//Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord.
package ass7q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	   int[] arr;
	   public Q1() {
		   this.arr=new int[5];
	   }
	   public int[] getArr() {
		return arr;
	}
	   public void setArr() {
		for(int i=0;i<this.arr.length;++i) {
			arr[i]=sc.nextInt();
		}
	}
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Q1 q=new Q1();
           q.setArr();
          int[] arr1= q.getArr();
          System.out.println(Arrays.toString(arr1));
             sc.close();
	}

}
