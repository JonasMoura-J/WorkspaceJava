package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 90.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Teclado", 95.00));

		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		//também pode ser feito assim:
		list.forEach(x -> x.setPrice(x.getPrice()*1.1));
		list.forEach(System.out::println);
	}
}