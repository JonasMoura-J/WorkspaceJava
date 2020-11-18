package entities;

import java.util.Date;

public class EntradaLog {
	private String nomeUsuario;
	private Date horaAcesso;
	
	public EntradaLog(String nomeUsuario, Date horaAcesso) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.horaAcesso = horaAcesso;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getHoraAcesso() {
		return horaAcesso;
	}

	public void setHoraAcesso(Date horaAcesso) {
		this.horaAcesso = horaAcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaLog other = (EntradaLog) obj;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		return true;
	}
	
}
