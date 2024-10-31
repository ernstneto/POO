package tarefa3;

import java.util.ArrayList;

public class Agencia {
	private final int numero;
	private long telefone;
	private Gerente gerente;
	private Endereco endereco;
	private ArrayList<Conta> contas;
	
	public Agencia(int numero, long telefone, Endereco endereco, Gerente gerente) {
		this.numero = numero;
		this.telefone = telefone;
		this.endereco = endereco;
		this.gerente = gerente;
		this.contas = new ArrayList<Conta>();
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}
	
	public Conta abrirConta(Pessoa titular, int numero) {
		Conta conta = new Conta(titular,numero);
		contas.add(conta);
		return conta;
	}
	
	public ContaEspecial abrirContaEspecial(Pessoa titular, double limite) {
		ContaEspecial contaespecial = new ContaEspecial(titular, limite);
		contas.add(contaespecial);
		return contaespecial;
	}
	
	public double getSaldoAgencia() {
		double saldo = 0;
		for (Conta conta : contas) {
			saldo += conta.getSaldo();
		}
		return saldo;
	}

}
