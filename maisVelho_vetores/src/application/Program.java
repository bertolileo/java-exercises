package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] vect = new Person[n];
		int oldestAge = 0;
		String oldestName = "";
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			vect[i] = new Person(name, age);
			
			if (vect[i].getAge() > oldestAge) {
				oldestAge = vect[i].getAge();
				oldestName = vect[i].getName();
			}
		}
		
		System.out.println();
		System.out.println("PESSOA MAIS VELHA: " + oldestName);
		sc.close();
	}

}
