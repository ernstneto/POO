package tarefa3;

public class ContaEspecial extends Conta{
	private double limite;
		
	public ContaEspecial(Pessoa titular, double limite) {
		super(titular, numConta);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double valor) {
		if(valor <= this.limite)
			return true;
		else
			return false;
	}
}
