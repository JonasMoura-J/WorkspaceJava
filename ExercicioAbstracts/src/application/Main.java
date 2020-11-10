package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuintes = new ArrayList<>(); 
		
		System.out.print("Digite o numero de Contribuintes: ");
		int cont = sc.nextInt();
		
		for (int i = 1; i <= cont; i++) {
			System.out.println("Contribuinte #" + i);
			
			System.out.print("Pessoa Física ou pessoa Juridica? (PF ou PJ): ");
			String pessoa = sc.next();
			sc.nextLine();
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if(pessoa.equals("PF")) {
				System.out.print("Gastos com saúde: ");
				double gastos = sc.nextDouble();
				
				Contribuinte PF = new PessoaFisica(nome, renda, gastos);
				contribuintes.add(PF);
			}
			if (pessoa.equals("PJ")) {
				System.out.print("Numero de funcionarios: ");
				int numeroDeFuncionarios = sc.nextInt();
				
				Contribuinte PJ = new PessoaJuridica(nome, renda, numeroDeFuncionarios);
				contribuintes.add(PJ);
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------");
		System.out.println("IMPOSTOS PAGOS:");
		for (Contribuinte c : contribuintes) {
			System.out.printf(c.getNome() + ": $ %.2f", c.imposto());
		}
		
		sc.close();
	}

}
