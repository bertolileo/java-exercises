package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		
		try {
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.printf("New balance: %.2f%n", account.getBalance());
		} catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
				
		sc.close();
	}

}
