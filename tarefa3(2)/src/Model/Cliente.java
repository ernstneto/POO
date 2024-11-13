package Model;

public class Cliente {
	private final long cpf;
	private String nome;
	private long telefone;
	private String email;
	private boolean platium;

	public Cliente(long cpf, String nome, long telefone, String email, boolean platium) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.platium = platium;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPlatium() {
		return platium;
	}

	public void setPlatium(boolean platium) {
		this.platium = platium;
	}

	public long getCpf() {
		return cpf;
	}
	
	
}
