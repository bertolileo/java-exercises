package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.print("How many dollaers will be bought?");
		double valor = sc.nextDouble();
		
		System.out.printf("Amount to be paid in R$ = %.2f", CurrencyConverter.dollarConverter(valor, dollar));
		
		sc.close();
	}

}
