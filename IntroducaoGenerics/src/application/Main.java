package application;

import java.util.Scanner;

import services.PrintService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("Quantos valores irá digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
			
		}
		
		ps.print();
		System.out.println("Primeiro digitado: " + ps.primeiro());
		
		sc.close();
	}

}
