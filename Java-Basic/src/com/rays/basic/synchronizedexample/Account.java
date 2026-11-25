package com.rays.basic.synchronizedexample;

public class Account {
public int balance;

public Account() {
}
public Account(int balance) {
	this.balance = balance;
}

public int getBalance() {
	try {
		Thread.sleep(200);
	} catch (Exception e) {
e.printStackTrace();
}
	return balance;
}





public void setBalance(int balance) {
	
	try {
		Thread.sleep(200);
	} catch (Exception e) {
e.printStackTrace();
}
	this.balance = balance;
}

  public synchronized void deposit(String name,int amt) {
	 int total=getBalance()+amt;
	 setBalance(total);
	 
	 System.out.println(name+" "+getBalance());
  }
 
}
