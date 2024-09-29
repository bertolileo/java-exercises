package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			Map<String, Integer> votes = new HashMap<>();
			while (line != null) {
				String[] fields = line.split(",");
				Integer num = Integer.parseInt(fields[1]);
				if (!votes.containsKey(fields[0])) {
					votes.put(fields[0], num);
				} else {
					votes.put(fields[0], votes.get(fields[0]) + num);
				}
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception ex) {
		    System.out.println("Error occurred: " + ex.getMessage());
		}
		
		sc.close();
	}

}
