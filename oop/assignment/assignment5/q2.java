package org.example.domain;

import car.Car;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car c=new Car("baleno");
          System.out.println(c.toString());
	}

}
package car;

import vehicle.Vehicle;

public class Car extends Vehicle {
private String model;
public Car(String model){
	super("maruti",2010);
	this.model=model;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String toString() {
	return this.model+" "+super.toString();
}
}
package vehicle;

public class Vehicle {
       private String make;
       private int year;
       public Vehicle (String make , int year){
    	   this.make=make;
    	   this.year=year;
       }
       public String getMake() {
		return make;
	}
       public int getYear() {
		return year;
	}
       
       public void setMake(String make) {
		this.make = make;
	}
       public void setYear(int year) {
		this.year = year;
	}
       public String toString() {
    	   return this.make+" "+this.year;
       }
}
