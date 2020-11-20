package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		System.out.print("Digite algum salario: ");
		double salario = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Funcionario> lista = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				
				lista.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<String> filtrandoSalarios = lista.stream()
					.filter(x -> x.getSalario() > salario)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			filtrandoSalarios.forEach(System.out::println);
			
			double somaSalario = lista.stream()
					.filter(x -> x.getNome()
					.charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("SOma do salario das pessoas que cuja o nome começa com a letra 'M': " + somaSalario);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
