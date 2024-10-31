package tarefa2_2;

import java.util.Date;
import java.util.ArrayList;

public class Conta {
	private int numero;
	private final Date dataAbertura;
	private final ArrayList<Transacao> credito;
	private final ArrayList<Transacao> debito;
	private Cliente titular;

	public Conta(int numero, Cliente titular) {
		this.dataAbertura = new Date();
		this.numero = numero;
		this.credito = new ArrayList<Transacao>();
		this.debito = new ArrayList<Transacao>();
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void depositar(double valor) {
		Transacao c = new Transacao(valor);
		credito.add(c);
	}

	public boolean sacar(double valor) {
		if (valor <= 0.0) {
			return false;
		} else if (valor > getTotalCredito()) {
			return false;
		}

		Transacao d = new Transacao(valor);
		debito.add(d);
		return true;
	}

	public double getTotalCredito() {
		double saldo = 0.0;
		for (Transacao transacao : credito) {
			saldo += transacao.getValor();
		}
		return saldo;
	}

	public double getTotalDebito() {
		double saldo = 0.0;
		for (Transacao transacao : debito) {
			saldo += transacao.getValor();
		}
		return saldo;
	}
	
	public double getSaldo() {
		return getTotalCredito() - getTotalDebito();
	}
	
	public StringBuilder listarExtrato() {
		StringBuilder extrato = new StringBuilder();
		extrato.append("Numero: ");
		extrato.append(getNumero());
		extrato.append('\n');
		extrato.append(" | Data abertura: ");
		extrato.append(getDataAbertura());
		extrato.append('\n');
		extrato.append(" | Cliente: ");
		extrato.append(titular.getNome());
		extrato.append("\n");
		extrato.append(" | CPF: ");
		extrato.append(titular.getCpf());
		extrato.append("\n");
		extrato.append(" | telefone: ");
		extrato.append(titular.getTelefone());
		extrato.append("\n");
		extrato.append(" | Email: ");
		extrato.append(titular.getEmail());
		extrato.append('\n');
		extrato.append(" | Saldo: ");
		extrato.append(getSaldo());
		return extrato;
	}
}
