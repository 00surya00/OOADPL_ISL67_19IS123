package Bank;

import java.util.HashSet;
import java.util.Collection;
import Bank.Account_Type;
import Bank.Customer;
import Bank.Account;

public class Branch{
	private HashSet<Customer> customers;
	private HashSet<Account> accounts;
	private static long accno=0;
	private char ifsc_code[];
	private String branch_name;
	public Branch(String branch_name,char[] ifsc_code){
		if(ifsc_code.length==12){
			System.out.println(ifsc_code.length);
			throw new IllegalArgumentException("Wrong IFSC code");
		}
		this.customers = new HashSet<Customer>();
		this.accounts = new HashSet<Account>();
		this.ifsc_code=ifsc_code;
		this.branch_name=branch_name;
	}
	public Account createAccount(Account_Type type,Collection<Customer> customers){
		this.customers.addAll(customers);
		Account account=new Account(++accno,type,customers);
		this.accounts.add(account);
		return account;
	}
	public void displayAccounts(){
		for(Account account : this.accounts){
			account.printDetails();
		}
	}
	public void deleteAccounts(Collection<Account> accounts){
		for(Account account:accounts){
			this.accounts.remove(account);
		}
	}
	public void printDetails(){
		System.out.println("Branch Name - "+this.branch_name);
		System.out.println("IFSC code - "+new String(this.ifsc_code));
		System.out.println("Number of accounts - "+this.accounts.size());
	}
}
