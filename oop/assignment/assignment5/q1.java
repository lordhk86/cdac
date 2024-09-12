//shewata mam's assignement
package org.example.main;

import org.example.subclass.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           SavingsAccount sv=new SavingsAccount();
           sv.setBalance(20000);
           sv.withdraw(1000);
           System.out.println(sv.getBalance());
	}

}
package org.example.subclass;

import org.example.demo.BankAccount;

public class SavingsAccount extends BankAccount {
     @Override
	public void withdraw(double ammount) {
		if(ammount<=10000) {
			super.withdraw(ammount);
		}
	}

}
package org.example.demo;

public class BankAccount {
private double balance;
public BankAccount(){
	
}
public void withdraw(double ammount) {
	this.balance-=ammount;
}
public void deposit(double ammount) {
	this.balance+=ammount;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public String toString() {
	return this.balance+"";
}
}
