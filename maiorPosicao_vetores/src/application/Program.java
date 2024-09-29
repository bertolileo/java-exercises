package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		
		double maiorNum = 0.0;
		int posicaoMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maiorNum) {
				maiorNum = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorNum);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		
		sc.close();
	}

}
