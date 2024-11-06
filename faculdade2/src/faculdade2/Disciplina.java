package faculdade2;

public class Disciplina {
	private String codigo;
	private String nome;
	private int creditos;
	private Professor professor;

	public Disciplina(String codigo, String nome, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.professor = professor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
