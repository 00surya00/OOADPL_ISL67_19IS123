package Bank;

import Bank.*;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		//Create Branch
		Branch example_branch=new Branch("Karki","KARB0000405".toCharArray());

		//Create Account
		Account surya_chinmay_account = example_branch.createAccount(Account_Type.Savings,Arrays.asList(
			new Customer("Surya Krishnamuti Hebbar",5571_7057_5782L),
			new Customer("Chinmay Krishnamuti Hebbar",5571_7057_5722L)
		));

		//Transactions
		surya_chinmay_account.Deposit(500);
		surya_chinmay_account.Withdraw(300);

		//Print Details First Time
		example_branch.printDetails();
		System.out.println("\nAccounts START");
		example_branch.displayAccounts();
		System.out.println("Accounts END");

		System.out.println();

		//Delete Account
		example_branch.deleteAccounts(Arrays.asList(surya_chinmay_account));

		//Print Details Second Time
		example_branch.printDetails();
		System.out.println("\nAccounts START");
		example_branch.displayAccounts();
		System.out.println("Accounts END");
	}
}
