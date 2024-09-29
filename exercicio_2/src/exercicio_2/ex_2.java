package exercicio_2;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/*
		int num = sc.nextInt();
		if (num > 1 && num < 1000) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("VALOR INVÁLIDO");
		}
		*/
		
		/*
		int in = 0;
		int out = 0;
		
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		*/
		
		/*
		double num1, num2, num3, peso;

		
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			num3 = sc.nextDouble();
			
			peso = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
			System.out.printf("%.1f%n", peso);
		}
		*/
		
		/*
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double divisao = (double) a / b;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		*/
		
		/*
		int num = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= num; i++) {
			
			if (num == 0) {
				res = 1;
			} else {
				res *= i;
			}
		}
		System.out.println(res);
		*/
		
		/*
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		*/
		
		int quadrado;
		int cubo;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		
		sc.close();
	}

}
