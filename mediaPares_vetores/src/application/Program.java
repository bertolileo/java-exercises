package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		double sumPares = 0;
		int pares = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				sumPares += vect[i];
				pares++;
			}
		}
		System.out.println();
		double avgPares = sumPares / pares;
		
		if (pares <= 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + avgPares);
		}
		
		sc.close();
	}

}
