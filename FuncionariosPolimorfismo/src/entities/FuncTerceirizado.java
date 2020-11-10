package entities;

public class FuncTerceirizado extends Funcionario{
	
	private double despezaAdicional;
	
	public FuncTerceirizado(String nome, int horas, double valorPorHora, double despezaAdicional) {
		super(nome, horas, valorPorHora);
		this.despezaAdicional = despezaAdicional;
	}
	
	public double getDespezaAdicional() {
		return despezaAdicional;
	}

	public void setDespezaAdicional(double despezaAdicional) {
		this.despezaAdicional = despezaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + despezaAdicional*1.1;
	}
}
