package Model;

public class Veiculo {
	private final String placa;
	private final int ano;
	private String cor;
	private final Modelo modelo;
	private Cliente proprietario;
	
	Veiculo(String placa, int ano, String cor, Modelo modelo, Cliente proprietario){
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
		this.proprietario = proprietario;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public Modelo getModelo() {
		return modelo;
	}
	
	public Cliente getProprietario() {
		return proprietario;
	}
	
}
