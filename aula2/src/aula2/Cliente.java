package aula2;

public class Cliente {
	private final long cpf;
	private String nome;
	private String email;

	public Cliente(long cpf, String nome, String email) {
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

}
