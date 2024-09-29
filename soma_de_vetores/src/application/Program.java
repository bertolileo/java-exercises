package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valoers vai ter cada vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			vect1[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			vect2[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int[] vectSum = new int[n];
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			vectSum[i] = vect1[i] + vect2[i];
			System.out.println(vectSum[i]);
		}
		
		
		sc.close();
	}

}
