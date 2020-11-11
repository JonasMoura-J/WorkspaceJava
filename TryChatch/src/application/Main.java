package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//		String[] vect = sc.nextLine().split(" "); //lendo dados da mesma linha e separado no vetor pelos espaços em branco
//		
//		int position = sc.nextInt();
//		System.out.println(vect[position]);
//		
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Posição inválida");
//			
//		}catch (InputMismatchException e) {
//			System.out.println("Entrada inválida");
//			e.printStackTrace();
//		}
//		
//		System.out.println("Fim do programa");
//		sc.close();
		
		File file = new File("/home/jonas/Documents/TesteJava.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo " + e.getMessage());
		
		}finally {
			
			if(sc != null) {
				sc.close();
			}
		}
	}
}
