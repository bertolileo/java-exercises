package exercicio_1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int senha = sc.nextInt();
		while (senha != 2002) {			
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		*/
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else {
				System.out.println("quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		*/
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
			
		
		int code = sc.nextInt();
		while (code != 4) {
			if (code == 1) {
				alcool++;
			} else if (code == 2) {
				gasolina++;
			} else if (code == 3) {
				diesel++;
			}
			
			code = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();

	}

}
