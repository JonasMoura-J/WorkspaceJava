package model.services;

public class ImpostoServicoBrasil implements ImpostoServico {
	public double imposto(double montante) {
		if(montante <=100.0) {
			return montante * 0.2;
		}
		return montante * 0.15;
	}
}
