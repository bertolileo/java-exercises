package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenses));
			} else {
				System.out.print("Number of employees: ");
				Integer numEmployees = sc.nextInt();
				list.add(new Company(name, income, numEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : list) {
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.totalIncome());
		}
		
		sc.close();
	}

}
