package tarefa3;

public class Teste {

	public static void main(String[] args) {
		 // Criar uma cidade
        Cidade cidade = new Cidade("São Paulo", "SP");
        
        // Criar endereços
        Endereco endereco1 = new Endereco("Rua 1", 100, "Centro", cidade);
        Endereco endereco2 = new Endereco("Avenida 2", 200, "Bairro 2", cidade);
        
        // Criar gerente
        Gerente gerente = new Gerente("Carlos Silva", 999999999L,"teste@gerete", endereco1, 101L, 20, 10);
		
        // Criar agência
        Agencia agencia = new Agencia(1, 33333333L, endereco1, gerente);
        
        // Criar clientes Pessoa Física
        PessoaFisica cliente1 = new PessoaFisica("João Souza", 88888888L, "joao@gmail.com", endereco1, 12345678901L);
        PessoaFisica cliente2 = new PessoaFisica("Maria Lima", 77777777L, "maria@gmail.com", endereco2, 98765432100L);
        
        // Criar clientes Pessoa Jurídica
        PessoaJuridica empresa1 = new PessoaJuridica("Empresa X", 66666666L, "empresaX@empresa.com", endereco2, 11223344556677L);
        
        // Abrir contas
        Conta conta1 = agencia.abrirConta(cliente1,1);
        Conta conta2 = agencia.abrirConta(cliente2,2);
        ContaEspecial contaEspecialEmpresa = agencia.abrirContaEspecial(empresa1, 10000.0);
        
        // Testar operações de depósito
        conta1.depositar(500.0);
        conta2.depositar(1500.0);
        contaEspecialEmpresa.depositar(10000.0);
        
        // Testar operações de saque
        conta1.sacar(200.0);
        conta2.sacar(500.0);
        contaEspecialEmpresa.sacar(15000.0);  // Testar limite especial
        
        // Listar extratos
        System.out.println("Conta 1: " + conta1.getSaldo());
        System.out.println("Conta 1: " + conta2.getSaldo());
        System.out.println("Conta especial - limite: " + contaEspecialEmpresa.getLimite());
        
        // Exibir saldo total da agência
        System.out.println("Saldo total na agência: " + agencia.getSaldoAgencia());

	}

}
