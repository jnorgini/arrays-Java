package application;

import java.util.Scanner;

import entities.HotelBusiness;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HotelBusiness[] rent = new HotelBusiness[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			sc.nextInt();
			
			rent[i] = new HotelBusiness(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			if(rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		

		sc.close();

	}

}
