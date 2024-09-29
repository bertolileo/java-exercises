package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Student[] vect = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %do aluno: \n", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			
			vect[i] = new Student(name, grade1, grade2);
		}
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			if (Student.aproveMethod(vect[i].getGrade1(), vect[i].getGrade2())) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
