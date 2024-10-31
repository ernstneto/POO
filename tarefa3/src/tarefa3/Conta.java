package tarefa3;

import java.util.Date;
import java.util.ArrayList;

public class Conta {
	protected static int numConta = 0;
	private final int numero;
	private final Date dataAbertura;
	private Pessoa titular;
	private ArrayList<Transacao> transacoes;
	
	public Conta(Pessoa titular, int numero) {
		this.dataAbertura =new Date();
		this.numero = ++numero;
		this.titular = titular;
		this.transacoes = new ArrayList<>();
	}
	
	public static int getNumConta() {
		return numConta;
	}

	public static void setNumConta(int numConta) {
		Conta.numConta = numConta;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void depositar(double valor) {
		transacoes.add(new Transacao(ETipoOperacao.CREDITO, valor));
	}
	
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			transacoes.add(new Transacao(ETipoOperacao.DEBITO, valor));
			return true;
		}
		return false;
	}
	
	public double getTotalCredito() {
		double valor = 0;
		for (Transacao transacao : transacoes) {
			if(transacao.getTipoOperacao() == ETipoOperacao.CREDITO) {
				valor += transacao.getValor();
			}
		}
		return valor;
	}
	
	public double getTotaldebito() {
		double valor = 0;
		for (Transacao transacao : transacoes) {
			if(transacao.getTipoOperacao() == ETipoOperacao.DEBITO) {
				valor += transacao.getValor();
			}
		}
		return valor;
	}
	
	public double getSaldo() {
		double saldo = 0;
		for (Transacao transacao : transacoes) {
			if(transacao.getTipoOperacao() == ETipoOperacao.DEBITO) {
				saldo -= transacao.getValor();
			}
			else if(transacao.getTipoOperacao() == ETipoOperacao.CREDITO) {
				saldo += transacao.getValor();
			}
		}
		return saldo;
	}
}

