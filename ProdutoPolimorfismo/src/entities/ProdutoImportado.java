package entities;

public class ProdutoImportado extends Produto{
	public double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	public Double precoTotal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public void etiquetaPreco() {
		System.out.println(getNome() + " $ " + precoTotal() + "(taxa alfandegaria: $ " + taxaAlfandega + ")");
	}
}
