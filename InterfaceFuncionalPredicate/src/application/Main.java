package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 90.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Teclado", 95.00));

		list.removeIf(new ProductPredicate());

		for (Product p : list) {
			System.out.println(p);
		}
	}
}