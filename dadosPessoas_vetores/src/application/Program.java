package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char gender = sc.next().charAt(0);
			
			vect[i] = new Person(height, gender);	
		}
		double maiorAltura = vect[0].getHeight();
		double menorAltura = vect[0].getHeight();
		double alturaSumF = 0;
		int mulheresNum = 0;
		int homensNum = 0;
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getHeight() > maiorAltura) {
				maiorAltura = vect[i].getHeight();
			}
			
			if (vect[i].getHeight() < menorAltura) {
				menorAltura = vect[i].getHeight();
			}
			
			if (vect[i].getGender() == 'F') {
				alturaSumF += vect[i].getHeight();
				mulheresNum++;
			} else {
				homensNum++;
			}
		}
		double avgMulheres = alturaSumF / mulheresNum;
		System.out.println();
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avgMulheres);
		System.out.println("Numero de homens = " + homensNum);
		
		
		System.out.println();
		
		
		sc.close();
	}

}
