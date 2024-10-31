package tarefa2_2;

import java.util.ArrayList;

public class Agencia {
	private int numero;
	private long telefone;
	private Gerente gerente;
	private ArrayList<Conta>contas;
	
	public Agencia(int numero, long telefone, Gerente gerente) {
		super();
		this.numero = numero;
		this.telefone = telefone;
		this.gerente = gerente;
		this.contas = new ArrayList<Conta>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Conta abrirConta(int num, Cliente titular) {
		Conta account = new Conta(num,titular);
		contas.add(account);
		return account;
	}
	
	public double getSaldoAgencia() {
		double saldo =0.0;
		for (Conta conta : contas) {
			saldo += conta.getSaldo();
		}
		return saldo;
	}
	
	
	

}
