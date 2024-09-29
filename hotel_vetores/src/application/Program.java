package application;

import java.util.Scanner;

import entities.Guests;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		Guests[] guest = new Guests[10];
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			guest[room] = new Guests(name, email, room);
			System.out.println();
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(guest[i] != null) {
				System.out.println(guest[i]);
			}
		}
		
		
		sc.close();
	}

}
