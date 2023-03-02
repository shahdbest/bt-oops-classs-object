package com.stackroute.oops;

public class Account {
	
	private static int counter;
	private int accountNo;
	private double balance;
	private String status;

    public Account(double balance, String status) {
    	this.balance =balance;
    	this.status =status;
    	counter++;
    	accountNo=counter;
    }

    public boolean depositAmount(double amount) {
    	if (status.equals("active")) {
    		balance +=amount;
            return true;
    	}
    	else
    		return false;
    }

    public String getAccountDetails() {
    	return "[Account No : " +accountNo+ ", Status : " +status+ ", Balance : "+balance+ "]";
    }

    public static int getCounter() {
        return Account.counter;
    }

    public static void setCounter(int counter) {
    	Account.counter =counter;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
    	this.status = status;
    }
}