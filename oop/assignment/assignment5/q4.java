package org.example.domain;

import animal.Animal;
import dog.Dog;
class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Dog d=new Dog();
//          d.setName("montu");
//          d.bark();
//          d.eat();
//          d.sleep();
//          Animal a=new Animal();
//          a.setName("chomu");
//          a.eat();
//          a.sleep();
		Student s=new Student();
		s.setName("ayush");
		s.setAge(24);
		System.out.println(s.getName()+" "+s.getAge());
	}

}
