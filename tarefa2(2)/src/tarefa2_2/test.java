package tarefa2_2;

public class test {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Neto", "ernstneto94@bank.com", 100);
		System.out.println("Gerente: \n"+ " | Nome: " + gerente.getNome() + "\n | Email: " + gerente.getEmail() + "\n | ramal: " + gerente.getRamal());
		Agencia agencia = new Agencia(1,222L,gerente);
		Cliente titular1 = new Cliente(1111L, "Ernst", "ernstneto@hotmail.de", 22213L);
		Cliente titular2 = new Cliente(2222L,"Zeidler","neto@pinel.com",12345L);
		Conta conta1;
		Conta conta2;
		conta1 = agencia.abrirConta(1, titular1);
		conta2 = agencia.abrirConta(2, titular2);
		conta1.depositar(10000);
		conta2.depositar(5000);
		conta1.sacar(1000);
		conta2.sacar(750);
		conta1.depositar(12345);
		conta2.depositar(12345);
		conta1.sacar(123);
		conta2.sacar(123);
		System.out.println(conta1.listarExtrato());
		System.out.println(conta2.listarExtrato());
		System.out.println("Agencia: ");
		System.out.println(" | Saldo Agencia: " + agencia.getSaldoAgencia());
	}

}
