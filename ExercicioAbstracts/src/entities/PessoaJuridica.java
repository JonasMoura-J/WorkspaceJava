package entities;

public class PessoaJuridica extends Contribuinte{
	
	protected int numeroDeFuncionarios;
	
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		
		return (numeroDeFuncionarios > 10)? rendaAnual * .14 : rendaAnual * .16;
	}

}
