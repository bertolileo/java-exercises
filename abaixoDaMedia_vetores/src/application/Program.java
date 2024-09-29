package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double vectSum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			vectSum += vect[i];
		}
		System.out.println();
		double vectAvg = vectSum / vect.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", vectAvg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < vectAvg) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
