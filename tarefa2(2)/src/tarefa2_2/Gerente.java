package tarefa2_2;

public class Gerente {
	private String nome;
	private String email;
	private int ramal;
	
	public Gerente(String nome, String email, int ramal) {
		this.nome = nome;
		this.email = email;
		this.ramal = ramal;
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

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}	

}
