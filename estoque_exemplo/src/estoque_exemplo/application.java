package estoque_exemplo;

import java.util.Scanner;

import entities.Product;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.print("Product data: " + produto);
		
		System.out.println("\n");
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		produto.addProducts(add);
		
		System.out.println();
		System.out.print("Updated data: " + produto);
		
		System.out.println("\n");
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		produto.removeProducts(remove);
		
		System.out.println();
		System.out.print("Updated data: " + produto);
		
		sc.close();
	}

}
