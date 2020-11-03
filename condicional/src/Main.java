import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o total de minutos: ");
		
		int minuts = sc.nextInt();
		double planoBasico = 50.0;
		
		if(minuts>100) {
			double valor = minuts - 100;
			double total = planoBasico + valor*2;
			System.out.printf("Valor a pagar: R$ %.2f", total);
		}else {
			System.out.printf("Valor a pagar: R$ %.2f", planoBasico);
		}
		
		sc.close();
	}

}
