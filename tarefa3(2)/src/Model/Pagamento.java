package Model;

import java.util.Date;

import Enums.EPagamento;

public class Pagamento {
	private final EPagamento tipo;
	private final Date data;
	private final double valor;

	public Pagamento(EPagamento tipo, double valor) {
		super();
		this.tipo = tipo;
		this.data = new Date();
		this.valor = valor;
	}

	public EPagamento getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

}
