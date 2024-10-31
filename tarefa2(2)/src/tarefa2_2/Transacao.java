package tarefa2_2;

import java.util.Date;

public class Transacao {
	private final Date data;
	private double valor;

	public Transacao(double valor) {
		// super();
		this.data = new Date();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

}
