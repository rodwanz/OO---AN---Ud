package application5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities5.Account5;
import entities5.BusinessAccount;
import entities5.SavingsAccount;

public class ProgramaAccount5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Account5> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new SavingsAccount(1005, "Anna", 500.00, 500.0));
		
		double sum = 0.0;
		for(Account5 acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account5 acc : list) {
			acc.deposit(10.0);;
		}
		
		for(Account5 acc : list) {
			System.out.printf("Update balance for account: %d %.2f%n", acc.getNumber(),acc.getBalance());
		}
		
//		Account5 acc = new Account5(1001, "Alex", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//		
//		// UPCASTING
//		
//		Account5 acc1 = bacc;
//		Account5 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//		Account5 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		// DOWNCASTING
//		
//		// BusinessAccount acc5 = (BusinessAccount)acc3;
//		
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount)acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan!");
//		}
//		
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount)acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
		
//		Account5 acc1 = new Account5(1001, "Alex", 1000.0);
//		acc1.withDraw(200.0);
//		System.out.println(acc1.getBalance());
//		
//		Account5 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//		acc2.withDraw(200.0);
//		System.out.println(acc2.getBalance());
//		
//		Account5 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
//		acc3.withDraw(200.0);
//		System.out.println(acc3.getBalance());
		
//		Account5 x = new Account5(1020, "Alex", 1000.0);
//		Account5 y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//		
//		x.withDraw(50.0);
//		y.withDraw(50.0);
//		
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());

	}

}
