package entities;

import java.util.Date;

public class ProdutoUsado extends Produto{
	public Date dataFabricacao;
	
	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public void etiquetaPreco() {
		System.out.println(getNome() + " (usado) " + " $ " + getPreco() + "(Fabricado dia " + dataFabricacao + ")");
	}
}
