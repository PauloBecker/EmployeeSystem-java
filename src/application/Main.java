package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = tc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Emplyoee # " + (i+1) + ": ");
			System.out.print("Id: ");
			int id = tc.nextInt();
			System.out.print("Name: ");
			tc.nextLine();
			String name = tc.nextLine();
			System.out.print("Salary: ");
			double salary = tc.nextDouble();
			emp.add(new Employee(id, name, salary));
			
		}
	
			System.out.print("Enter the employee id that will have salary increase : ");
			int idSalary = tc.nextInt();
			Integer pos = position(emp, idSalary);
			if(pos == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percent = tc.nextDouble();
				emp.get(pos).increaseSalary(percent);
			}
	
		
			System.out.println();
			System.out.println("List of Emplyee: ");
			for(Employee x : emp) {
				System.out.println(x);
			}
			
		tc.close();
	}
	
	//Função para achar a posição na lista
	public static Integer position(ArrayList<Employee> emp, int id) {
		for(int i = 0; i < emp.size(); i++) {
			if(emp.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	

}
