package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produtos = new ArrayList <>();
		
		System.out.print("Quantos produtos deseja informar? ");
		int qnt = sc.nextInt();
		
		for (int i = 1; i <= qnt; i++) {
			System.out.println("Produto #" + i + ": ");
			
			System.out.print("Comum, usado ou importado? (c/u/i) ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			switch (resp) {
				case 'c': {
					Produto prod = new Produto(nome, preco);
					produtos.add(prod);
					break;
				}
				case 'u': {
					System.out.print("Data de fabricação: (DD/MM/YYYY): ");			
					Date dadataFabricacao = sdf.parse(sc.next());
					
					Produto prod = new ProdutoUsado(nome, preco, dadataFabricacao);
					produtos.add(prod);
					break;
				}
				
				case 'i': {
					System.out.print("Taxa Alfandegária: ");
					double taxaAlfandega = sc.nextDouble();
					Produto prod = new ProdutoImportado(nome, preco, taxaAlfandega);
					produtos.add(prod);
					break;
				}
				
				default:
					throw new IllegalArgumentException("valor inválido");
				}
			
			
			System.out.println();
		}
		
		System.out.println("-------------------------");
		System.out.println("Etiquetas de preços: ");
		for (Produto prod : produtos) {
			prod.etiquetaPreco();
		}
		
		sc.close();
	}

}

