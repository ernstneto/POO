package faculdade2;

public class Professor {
	private String nome;
	private String email;
	private String titulacao;

	public Professor(String nome, String email, String titulacao) {
		this.nome = nome;
		this.email = email;
		this.titulacao = titulacao;
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

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

}
