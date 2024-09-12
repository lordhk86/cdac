package org.example.domain;

import animal.Animal;
import dog.Dog;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dog d=new Dog();
          d.setName("montu");
          d.bark();
          d.eat();
          d.sleep();
          Animal a=new Animal();
          a.setName("chomu");
          a.eat();
          a.sleep();
	}

}
package dog;

import animal.Animal;

public class Dog extends Animal{
public void bark() {
	System.out.println(super.getName()+" barks");
}
}
package animal;

public class Animal {
private String name;
public Animal(){
	
}
public void eat() {
	System.out.println(this.name+"  eats food");
}
public void sleep() {
	System.out.println(this.name+"  animal sleeps");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
