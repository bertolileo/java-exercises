package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.printf("Employee #%d:\n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (Employee.hasId(list, id) != -1) {
				System.out.printf("Id already taken, please try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will habe a salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();

		if (Employee.hasId(list, id).equals(-1)) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(Employee.hasId(list, id)).salaryIncrease(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	

}
