package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarros;
import model.entities.Veiculo;
import model.services.ImpostoServicoBrasil;
import model.services.ServicoAluguel;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Digite os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Quando foi retirado (dd/MM/yyyy hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		
		System.out.print("Quando retornou dd/MM/yyyy hh:ss): ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarros aluguel = new AluguelCarros(inicio, fim, new Veiculo(modelo));
		
		System.out.print("Digite o preço por hora: ");
		double hora = sc.nextDouble();
		
		System.out.print("Digite o preço por dia: ");
		double dia = sc.nextDouble();
		
		ServicoAluguel servico = new ServicoAluguel(dia, hora, new ImpostoServicoBrasil());
		
		servico.processarFatura(aluguel);
		
		System.out.println("FATURA: ");
		System.out.printf("Pagamento basico: %.2f \n", aluguel.getFatura().getPagamentoBasico());
		System.out.printf("Imposto: %.2f \n", aluguel.getFatura().getImposto());
		System.out.printf("Pagamento total: %.2f \n", aluguel.getFatura().getPagamentoTotal());
		
		sc.close();
	}

}
