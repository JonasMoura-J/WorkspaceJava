package model.services;

import model.entities.AluguelCarros;

public class ServicoAluguel {
	private Double precoPorDia;
	private Double precoPorHora;
	
	private ImpostoServicoBrasil imposto;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ImpostoServicoBrasil imposto) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.imposto = imposto;
	}
	
	public void processarFatura(AluguelCarros aluguel) {
		
	}
}
