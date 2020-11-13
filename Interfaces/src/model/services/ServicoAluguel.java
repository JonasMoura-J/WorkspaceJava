package model.services;

import model.entities.AluguelCarros;
import model.entities.Fatura;

public class ServicoAluguel {
	private Double precoPorDia;
	private Double precoPorHora;
	
	private ImpostoServicoBrasil servicoImposto;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ImpostoServicoBrasil imposto) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.servicoImposto = imposto;
	}
	
	public void processarFatura(AluguelCarros aluguel) {
		long t1 = aluguel.getInicio().getTime();
		long t2 = aluguel.getFim().getTime();
		
		double hours = (double) (t2 - t1)/1000/60/60;
		
		double pagamentoBasico;
		if (hours <= 12.0) {
			pagamentoBasico = Math.ceil(hours) * precoPorHora;
		}else {
			pagamentoBasico = Math.ceil(hours/24) * precoPorDia;
		}
		double imposto = servicoImposto.imposto(pagamentoBasico);
		
		aluguel.setFatura(new Fatura(pagamentoBasico, imposto));
	}
}
