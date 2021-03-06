package model.entities;

import model.exceptions.LimitException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		super();
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Double withdraw(Double amount){
		if (amount > withdrawLimit) {
			throw new LimitException("Withdraw error: The amount exceeds withdraw limit");
		}else if (amount > balance) {
			throw new LimitException("Withdraw error: Not enough balance");
		}
		
		balance -= amount;
		return balance;
	}
	
	
	public void deposit(Double amount) {
		this.balance += amount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
}
