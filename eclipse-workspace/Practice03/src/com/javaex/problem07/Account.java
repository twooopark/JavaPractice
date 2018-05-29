package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
        
    //필요한 메소드 작성
    public void deposit(int money) {
    	this.balance += money;
    }
    public void withdraw(int money) {
    	this.balance -= money;
    }
    public void showBalance() {
    	System.out.println(this.balance);
    }
    
}
