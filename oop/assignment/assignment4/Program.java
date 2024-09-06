import java.util.Scanner;

class Employee{
	private int empid;
	private double salary;
	private String name;
	static Scanner sc = new Scanner(System.in);
	public void getRecord() {
		this.empid=sc.nextInt();
		this.name=sc.next();
		this.salary=sc.nextDouble();
		
	}
	public void printrecord() {
		System.out.println(this.empid+" "+this.name+" "+this.salary);
	} 
}
public class Program {
    Employee s= new Employee();
    Employee s1= new Employee();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Program p1 = new Program();
         p1.s.getRecord();
         p1.s1.getRecord();
         p1.s.printrecord();
         p1.s.printrecord();
         Employee.sc.close();
	}
}
