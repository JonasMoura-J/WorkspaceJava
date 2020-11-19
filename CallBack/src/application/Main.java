package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 90.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Teclado", 95.00));

		ProductService ps = new ProductService();
		
		//funcao recebendo outra funcao como parametro
		double sum = ps.SomarFiltrados(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.printf("Sum = %.2f", sum);
	}
}