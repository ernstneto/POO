package tarefa3;

import java.util.Date;
import java.util.UUID;

public class Transacao {
	private final String id;
	private final ETipoOperacao tipo;
	private final Date data;
	private final double valor;
	
	public Transacao(ETipoOperacao tipo, double valor) {
		this.id = UUID.randomUUID().toString();
		this.tipo = tipo;
		this.data = new Date();
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public ETipoOperacao getTipoOperacao() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}
	
	

}
