package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");	
		System.out.print("Name: ");
		String Name = sc.nextLine();
		
		
		System.out.print("Price: ");
		double Price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");	
		int Quantity = sc.nextInt();
		
		
		Product product = new Product(Name, Price, Quantity);
		
		product.setName("Jonas");
		System.out.println("Updated name: " + product.getName());
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter with number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter with number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		
		
		sc.close();
	}

}
