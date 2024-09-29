package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double salaryCeil = sc.nextDouble();
		System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryCeil));
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				list.add(new Employee(parts[0], parts[1], Double.parseDouble(parts[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> filteredEmail = list.stream()
					.filter(p -> p.getSalary() > salaryCeil)
					.map(p -> p.getEmail()).sorted(comp)
					.collect(Collectors.toList());
			
			filteredEmail.forEach(System.out::println);
			
			char filteredLetter = 'M';
			List<Employee> filteredPeople = list.stream()
					.filter(nome -> nome.getName().charAt(0) == filteredLetter)
					.collect(Collectors.toList());
					
			double salarySum = filteredPeople.stream()
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with " + filteredLetter + ": " + String.format("%.2f", salarySum));
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
