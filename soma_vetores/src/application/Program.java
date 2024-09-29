package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.print("VALORES = ");
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];
		}
		double avg = sum / vect.length;
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();
	}

}
