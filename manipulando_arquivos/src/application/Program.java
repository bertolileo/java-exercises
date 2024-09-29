package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		String dataPath = "D:\\JAVA\\productData.txt";
		String summary = "D:\\\\JAVA\\\\summary.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(dataPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(",");
				Product product = new Product(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]));
				productList.add(product);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary))) {
			
			for (Product p : productList) {
				bw.write(p.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
