package com.rays.basic.synchronizedexample;

public class AccountThread extends Thread{
private String name;
private static Account a= new Account();


public AccountThread(String name) {
	this.name=name;
}


@Override
	public void run() {

for (int i = 1; i <=5; i++) {
	try {
		sleep(200);
	} catch (Exception e) {
		// TODO: handle exception
	}
	a.deposit(name, 1000);
}

}
	
}
