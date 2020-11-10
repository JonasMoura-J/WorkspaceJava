package entities;

public class PessoaFisica extends Contribuinte{
	
	protected double gastosSaude;
	
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double imposto() {
		double total;
		
		if(super.rendaAnual < 20000.00) {
			total = rendaAnual*0.15;
			
		}else {
			total = rendaAnual*0.25;
		}
		
		if(gastosSaude > 0) {
			total = total - gastosSaude * .5;
		}
		return total;
	}
	
}
