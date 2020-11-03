package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Salario salario = new Salario();
		
		System.out.print("Name: ");
		salario.nome = sc.nextLine();
		
		System.out.print("Gross salary: ");
		salario.glossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println("Employee: = " + salario.nome + ", " + salario.netSalary());
		
		System.out.println("Which percentage to intecrease salary? ");
		double percent = sc.nextDouble();
		salario.increaseSalary(percent);
		
		System.out.println("Updated data: " + salario.nome + " , " + salario.netSalary());
		
		sc.close();

	}

}
