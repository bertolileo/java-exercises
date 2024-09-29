package application;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", aluno.notaFinal()));
		System.out.println(aluno);
		
		sc.close();
	}

}
