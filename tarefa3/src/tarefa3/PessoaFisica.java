package tarefa3;

public class PessoaFisica extends Pessoa{
	private long cpf;
	
	public PessoaFisica(String nome, long telefone, String email, Endereco endereco, long cpf) {
		super(nome, telefone, email, endereco);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "CPF: " + cpf;
	}

}
