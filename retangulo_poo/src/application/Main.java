package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter the rectangle's width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETER = " + retangulo.perimeter());
		System.out.println("DIAGONAL = " + retangulo.diagonal());
		
		sc.close();
	}

}
