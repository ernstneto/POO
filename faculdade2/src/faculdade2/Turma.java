package faculdade2;

import java.util.ArrayList;

public class Turma {
	private int numero;
	private int serie;
	private boolean disponivel;
	private ArrayList<Aluno>alunos;
	private ArrayList<Disciplina>disciplinas;
	public Turma(int numero, int serie) {
		this.numero = numero;
		this.serie = serie;
		this.disciplinas = new ArrayList<Disciplina>();
		this.alunos = new ArrayList<Aluno>();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		for (Aluno target : alunos) {
			if(target == aluno) {
				alunos.remove(aluno);
			}
		}
	}
	public String listarAlunos() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de alunos:");
		for (Aluno aluno : alunos) {
			sb.append(" | Aluno: " + aluno.getNome()); "\n | matricula: " aluno.getMatricula() + "\n | email: " + aluno.getEmail());
		}
		return sb;
	}
	
	public StringBuilder listarDisciplinas() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de disciplinas: ");
		for (Disciplina disciplina : disciplinas) {
			sb.append(" | Codigo: " + disciplina.getCodigo() + "\n | nome: " + disciplina.getNome() + "\n | creditos: " + disciplina.getCreditos());
		}
		return sb;
	}
}
