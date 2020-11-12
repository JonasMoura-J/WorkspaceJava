package application;

import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");
		String caminho = sc.nextLine();
		
		File path = new File(caminho);
		
		//a linha a seguir irá criar um vetor contendo cada caminho das pastas
		File[] pastas = path.listFiles(File::isDirectory); //funcao lambda para filtrar apenas as pastas
		System.out.println("PASTAS: ");
		
		//irá percorrer o vetor pastas e irá imprimir o caminho de cada pasta que estiver dentro do caminho informado
		for(File p: pastas) {
			System.out.println(p);
		}
		
		System.out.println("=====================================");
		
		//irá ler somente os arquivos
		File[] arquivos = path.listFiles(File::isFile); //funcao lambda para filtrar apenas as pastas
		System.out.println("PASTAS: ");
		
		
		System.out.println("ARQUIVOS: ");
		for(File p: arquivos) {
			System.out.println(p);
		}

		//criando subpasta a dentro da pasta informada(caminho)
		boolean success = new File(caminho + "//subdir").mkdir();
		System.out.println("Diretório criado? " + success);
		sc.close();
	}

}
