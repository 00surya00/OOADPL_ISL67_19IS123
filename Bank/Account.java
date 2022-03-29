package Bank;

import Bank.Customer;
import Bank.Account_Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.StringJoiner;

public class Account{
	private long account_number;
	private Account_Type type;
	private int balance;
	private HashSet<Customer> customers;
	public Account(long account_number,Account_Type type,Collection<Customer> customers){
		this.account_number=account_number;
		this.type=type;
		this.balance=0;
		this.customers=new HashSet<Customer>();
		this.customers.addAll(customers);
	}
	public int getBalance(){
		return balance;
	}
	public void Deposit(int amount){
		this.balance+=amount;
	}
	public void Withdraw(int amount){
		this.balance-=amount;
	}
	public void printDetails(){
		System.out.println("Account Number: "+this.account_number);
		System.out.print("Customer Name(s): ");
		StringJoiner customer_names=new StringJoiner(", ");
		for(Customer customer : this.customers){
			customer_names.add(customer.getFullName());
		}
		System.out.println(customer_names.toString());
		System.out.println("Account Type: "+this.type);
		System.out.println("Balance : "+this.balance);
	}
}
