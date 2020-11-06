package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.print("How many employees will be registered? ");
		int size = sc.nextInt();
		
		List<Funcionarios> list = new ArrayList<>();
			
		for(int i = 1; i<=size; i++) {
			System.out.println("Emplyoee #" + i);
			
			System.out.print("Id :");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, name, salary);
			list.add(func);
			
			System.out.println("---------------------");
		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		
		Funcionarios f = new Funcionarios();
		Integer pos = f.position(list, idSalary);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			
			list.get(pos).incraseSalary(percent);
			
			for (Funcionarios fu : list) {
				System.out.println(fu);
			}
		}
		
		sc.close();
		
	}

}
