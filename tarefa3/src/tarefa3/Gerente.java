package tarefa3;

public class Gerente extends PessoaFisica{
	private final int matricula;
	private int ramal;
	
	public Gerente(String nome, long telefone, String email, Endereco endereco, long cpf, int matricula, int ramal) {
        super(nome, telefone, email, endereco, cpf);  // Chamada ao construtor de PessoaFisica
        this.matricula = matricula;
        this.ramal = ramal;
    }

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public int getMatricula() {
		return matricula;
	}
	
}
