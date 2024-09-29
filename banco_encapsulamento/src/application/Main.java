package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char conf = sc.next().charAt(0);
		if (conf == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			account = new Account(name, number, valor);
		} else {
			account = new Account(name, number);
		}
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double num = sc.nextDouble();
		account.deposit(num);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		num = sc.nextDouble();
		account.withdraw(num);
		System.out.println("Updated account data: ");
		System.out.println(account);		
		
		sc.close();
	}

}
