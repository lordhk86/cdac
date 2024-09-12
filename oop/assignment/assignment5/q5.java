package org.example.domain;

import car.Car;
import motorcycle.Motorcycle;
import vehicle.Vehicle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Vehicle v=new Vehicle();
             Motorcycle m=new Motorcycle();
             Car c=new Car();
             v.startEngine();
             v.stopEnigne();
             m.startEngine();
             m.stopEnigne();
             c.startEngine();
             c.stopEnigne();
	}

}
package vehicle;

public class Vehicle {
public void startEngine() {
	System.out.println("s1 start engine ");
}
public void stopEnigne() {
	System.out.println("s1 stop engine");
}
}
package motorcycle;

import vehicle.Vehicle;

public class Motorcycle extends Vehicle {
	public void startEngine() {
		System.out.println("s2 start engine ");
	}
	public void stopEnigne() {
		System.out.println("s2 stop engine");
	}
}
package car;

import vehicle.Vehicle;

public class Car extends Vehicle{
	public void startEngine() {
		System.out.println("s3 start engine ");
	}
	public void stopEnigne() {
		System.out.println("s3 stop engine");
	}
}
