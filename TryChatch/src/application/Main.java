package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" "); //lendo dados da mesma linha e separado no vetor pelos espaços em branco
		
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			
		}catch (InputMismatchException g) {
			System.out.println("Entrada inválida");
		}
		
		System.out.println("Fim do programa");
		sc.close();
		
	}
	
	//InputMismatchException
	//ArrayIndexOutOfBoundsException
}
