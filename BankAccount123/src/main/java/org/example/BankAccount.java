package org.example;

import java.util.Objects;

public class BankAccount extends Object {
	
	public static int AccountCounter;
	
	private int AccountNumber;
	private double Balance;
	private String AccountName;
	
	public BankAccount(){
		this(AccountCounter++);
	}
	
	public BankAccount(int AccountNumber){
		this(AccountNumber, 0.0);
	}
	
	public BankAccount(int accountNumber, double balance) {
		this(accountNumber,balance,"Account "+ accountNumber);
	}
	
	public BankAccount(int accountNumber, double balance, String accountName) {
		AccountNumber = accountNumber;
		Balance = balance;
		AccountName = accountName;
		
		if (accountNumber > AccountCounter){
			AccountCounter = accountNumber + 1;
		}
	}
	
	public double RemoveFunds(double amount) throws Exception{
		if (this.Balance-amount < 0){
			throw new Exception("You can't have minus funds!");
		}
		this.Balance -= amount;
		return this.Balance;
	}
	
	public double AddFunds(double amount){
		this.Balance += amount;
		return this.Balance;
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	void setBalance(double balance) {
		Balance = balance;
	}
	
	public String getAccountName() {
		return AccountName;
	}
	
	void setAccountName(String accountName) {
		AccountName = accountName;
	}
	
	@Override
	public String toString(){
		return "BA: AccountNumber: " + this.AccountNumber + ", Balance: "+ this.Balance+ ", AccountName: "+this.AccountName;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BankAccount that = (BankAccount) o;
		return AccountNumber == that.AccountNumber && Double.compare(that.Balance, Balance) == 0 && Objects.equals(AccountName, that.AccountName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(AccountNumber, Balance, AccountName);
	}
}