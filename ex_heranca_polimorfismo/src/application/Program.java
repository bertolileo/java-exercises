package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: " );
		int n = sc.nextInt();
		List<Product> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else if (ch == 'i') {
				System.out.print("Custom Fee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
