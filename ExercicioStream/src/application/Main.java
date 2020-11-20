package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			//mostrando o preço medio de todos o produtos:
			double media = list.stream().map(x -> x.getPrice()).reduce(0.0, (x,y) -> x + y)/list.size();
			System.out.printf("Preço medio de todos os produtos: %.2f" , media);
			System.out.println();
			
			//mostrando os nomes, em ordem decrescente dos produtos que possuem preço inferior ao preço médio.
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> nomes = list.stream().filter(x -> x.getPrice() < media).map(x -> x.getName()).sorted(comp.reversed()).collect(Collectors.toList());
			nomes.forEach(System.out::println);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
