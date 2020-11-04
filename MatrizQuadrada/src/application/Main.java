package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a dimensão da matriz: ");  //ex: 3 será uma matriz 3x3; 4 será 4x4
		int dimen = sc.nextInt();
		
		int[][] matriz = new int[dimen][dimen];
		
		int contNegative = 0;
		
		for (int i = 0; i < dimen; i++) {
			for (int j = 0; j < dimen; j++) { //para cada linha do for i, será percorrido uma coluna na posição j
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
		for (int i = 0; i < dimen; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + contNegative);
		
	}

}
