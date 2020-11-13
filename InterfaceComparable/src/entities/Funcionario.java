package entities;

public class Funcionario implements Comparable<Funcionario>{
	private String nome;
	private Double sarario;
	
	public Funcionario(String nome, Double sarario) {
		super();
		this.nome = nome;
		this.sarario = sarario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSarario() {
		return sarario;
	}

	public void setSarario(Double sarario) {
		this.sarario = sarario;
	}

	@Override
	public int compareTo(Funcionario func ) {
		return nome.compareTo(func.getNome());
	}
}
