package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		
		double c = Calculator.circum(radius); //metodos statics n�o precisam se instanciados, basta por o nome da classe
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f", c);
		System.out.printf("Volume: %.2f", v);
		System.out.printf("PI value: %.2f", Calculator.PI);
		
		sc.close();
	}
}
