package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> alunos = new HashSet<>();
		
		for (int i = 0; i < 3; i++) {
			char curso = (i == 0)? 'A' : (i == 1)? 'B' : 'C';
			
			System.out.print("Quantos estudantes fazem o Curso " + curso + "? ");
			int qnt = sc.nextInt();
			
			for (int j = 0; j <qnt; j++) {
				int cod = sc.nextInt();
				alunos.add(cod);
			}
		}
		System.out.println("Total de alunos: " + alunos.size());
		sc.close();
	}
}
