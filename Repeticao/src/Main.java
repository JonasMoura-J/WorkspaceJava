import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		
//		int soma = 0;
//		
//		while(x != 0) {
//			soma = soma + x;
//			x = sc.nextInt();
//		}
//		
//		System.out.println(soma);
//		sc.close();
		
		
		//Exerc�cio 1
//		int x = sc.nextInt();
//		
//		int senha = 2002;
//		while(x != senha) {
//			System.out.println("Senha invalida");
//			x = sc.nextInt();
//		}
//		System.out.println("Acesso permitido");
//		sc.close();
		
		//Exercicio2
		int x = sc.nextInt();
		int y = sc.nextInt();

		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else {
				System.out.println("segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
		
	}
}