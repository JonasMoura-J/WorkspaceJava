import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Leitura de str
		System.out.print("Digite alguma coisa: ");
		String x = sc.next();
		System.out.println("Voce digitou o valor: " + x);
		
		
		//leitura de inteiros
		System.out.print("Digite um numero: ");
		int y = sc.nextInt();
		System.out.println("Voce digitou o valor: " + y);
		
		//para pegar apenas o primeiro caracter
		System.out.print("Digite uma palavra: ");
		char z = sc.next().charAt(0);
		System.out.println("A primeira letra da palavra �: " + z);
		
		sc.close();

	}

}
