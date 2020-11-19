package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Mouse", 90.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Teclado", 95.00));

		List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		//também pode ser feito assim, sem necessidade de criação de uma nova classe:
		List <String> name = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
		name.forEach(System.out::println);
	}
}
