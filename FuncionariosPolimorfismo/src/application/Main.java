package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncTerceirizado;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList <>();
		
		System.out.print("Quantos funcionarios deseja informar? ");
		int qnt = sc.nextInt();
		
		for (int i = 1; i <= qnt; i++) {
			System.out.println("Empregado #" + i + ": ");
			
			System.out.print("Terceirizado? (s/n) ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por horas: ");
			double valor = sc.nextDouble();
			
			if (resp == 's') {
				System.out.print("Despesa adicional: ");
				double desp = sc.nextDouble();
				
				Funcionario tercerizado = new FuncTerceirizado(nome, horas, valor, desp);
				funcionarios.add(tercerizado);
			}else {
				Funcionario padrao = new Funcionario(nome, horas, valor);
				funcionarios.add(padrao);
			}
			
			System.out.println();
		}
		
		System.out.println("-------------------------");
		System.out.println("PAGAMENTOS: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.printf(funcionario.getNome() + " - $ %.2f", funcionario.pagamento());
			System.out.println();
		}
		
		sc.close();
	}

}
