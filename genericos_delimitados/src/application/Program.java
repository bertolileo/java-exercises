package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.CalculationService;

public class Program {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		String path = "D:\\JAVA\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				list.add(new Product(parts[0], Double.parseDouble(parts[1])));
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Most expensive:");
		System.out.println(CalculationService.max(list));
	}
}
