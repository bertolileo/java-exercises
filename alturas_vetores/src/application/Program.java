package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int aux = 0;
		double sumAltura = 0;
		Person[] vect = new Person[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Person(name, age, height);
			
			sumAltura += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				aux += 1;
			}
		}
		System.out.println();
		
		double avg = sumAltura / vect.length;
		double percentage = (aux / (double) n) * 100;
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentage) + "%");
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
