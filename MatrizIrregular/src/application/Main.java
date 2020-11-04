package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o numero de linhas ");  //ex: 3 será uma matriz 3x3; 4 será 4x4
		int linha = sc.nextInt();
		
		System.out.print("Digite o numero de colunas ");  //ex: 3 será uma matriz 3x3; 4 será 4x4
		int coluna = sc.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		int contNegative = 0;
		
		for (int i = 0; i < linha ; i++) {
			for (int j = 0; j < coluna; j++) { //para cada linha do for i, será percorrido uma coluna na posição j
				matriz[i][j] = sc.nextInt();
				
				if(matriz[i][j] < 0) contNegative++;
			}
		}
		sc.close();
		//exemplo de entrada
//		3
//		5 10 2
//		15 -2 3
//		4 -5 -3
		
		System.out.print("Main diagonal: ");
		for (int i = 0; i < linha; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + contNegative);
		
	}

}
