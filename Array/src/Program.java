import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//tamanho do vetor
		//o prgrama lê as aulturas e faz uma média
		int n = sc.nextInt();
		
		double[]vect = new double[n];
		
		double cont = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite uma altura: ");
			vect[i]= sc.nextDouble();
			cont += vect[i];
		}
		
		sc.close();
		double media = cont/n;
		System.out.println("===============================");
		System.out.printf("A media das alturas é: %.2f", media);
	}

}
