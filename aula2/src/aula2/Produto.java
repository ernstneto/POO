package aula2;

public class Produto {
	private final long codbarras;
	private final String nome;
	private double preco;

	public Produto(long codbarras, String nome, double preco) {
		this.codbarras = codbarras;
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getCodbarras() {
		return codbarras;
	}

	public String getNome() {
		return nome;
	}

}
