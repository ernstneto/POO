package tarefa3;

public class PessoaJuridica extends Pessoa{
	private long cnpj;
	
	public PessoaJuridica(String nome, long telefone, String email, Endereco endereco, long cnpj) {
		super(nome, telefone, email, endereco);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {
		return "Pessoa Juridica: "+ getCnpj() + " Nome: " + getNome() + " Endereco " + getEndereco();
	}

}
