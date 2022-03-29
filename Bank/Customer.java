package Bank;

import java.util.HashSet;

public class Customer{
	private String full_name;
	private long ssn;
	public Customer(String full_name,long ssn){
		this.full_name=full_name;
		this.ssn=ssn;
	}
	public String getFullName(){
		return this.full_name;
	}
}
