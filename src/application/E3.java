package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class E3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increase(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:\n");
		for(Employees emp : list) {
			System.out.println(emp);
		}
	
		sc.close();
	}
	
	public static Integer position(List<Employees> list, int idsalary) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == idsalary) {
				return i;
			}
		}
		return null;
	}

}