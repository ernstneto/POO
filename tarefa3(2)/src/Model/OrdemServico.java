package Model;

import java.util.Date;
import java.util.ArrayList;
import Enums.EPagamento;
import Enums.ETipoItem;

public class OrdemServico {
	private static int contador = 0;

	private final int numero;
	private final Date data;
	private final int kmAtual;
	private String descricao;
	private ArrayList<ItemOS>itens = new ArrayList<>();
	private final Veiculo veiculo;
	private final Cliente cliente;

	public OrdemServico(int contador, int kmAtual, Veiculo veiculo, Cliente cliente) {
		super();
		this.numero = ++contador;
		this.data = new Date();
		this.kmAtual = kmAtual;
		this.descricao = "ABERTO";
		this.veiculo = veiculo;
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public int getKmAtual() {
		return kmAtual;
	}

	public static int getContador() {
		return contador;
	}
	
	public void addItem(ItemOS i, int qtde) {
		itens.add(qtde,i);
	}
	
	public double getTotalOS() {
		double valor = 0.0;
		for (ItemOS itemOS : itens) {
			valor += itemOS.getQtde() * itemOS.getPreco();
		}
		return valor;
	}
	
	public double getTotalServicos() {
		double valor = 0.0;
		for (ItemOS itemOS : itens) {
			if(itemOS.getItem().getTipo() == ETipoItem.SERVICO) {
				valor += itemOS.getPreco() * itemOS.getQtde();
			}
		}
		return valor;
	}
	
	public double getTotalPecas() {
		double valor = 0.0;
		for (ItemOS itemOS : itens) {
			if(itemOS.getItem().getTipo() == ETipoItem.PECA) {
				valor += itemOS.getPreco() * itemOS.getQtde();
			}
		}
		return valor;
	}
	
	public StringBuilder listarOS() {
		StringBuilder sb = new StringBuilder();
		
		return sb;
	}
	
	public StringBuilder pagamentoOS(EPagamento tipo) {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista da ORDEM DE SERVICO");
		sb.append(" | numero: " + String.format("%d", getNumero()));
		sb.append(" | data: " + getData());
		sb.append(" | kmAtual: " + String.format("%d", getKmAtual()));
		sb.append(" | descrição: " + getDescricao());
		sb.append(" | Cliente platinum: " + cliente.isPlatium());
		sb.append(" tipo de pagamento: " + tipo);
		sb.append(" | Total de pecas: " + String.format("%d", getTotalPecas()));
		sb.append(" | Total de servicos: " + String.format("%d", getTotalServicos()));
		sb.append(" | Desconto: " + String.format("%d", getTotalServicos()));
		//Pagamento pagamento = new Pagamento(tipo, getTotalOS());
		if(cliente.isPlatium() == true) {
			Pagamento pagamento = new Pagamento(tipo, getTotalOS() - getTotalServicos());
			sb.append(" | Total: " + String.format("%d", pagamento.getValor()));
			setDescricao("PAGO");
		}
		else {
			Pagamento pagamento = new Pagamento(tipo, getTotalOS());
			sb.append(" | Total: " + String.format("%d", pagamento.getValor()));
			setDescricao("PAGO");
		}
		sb.append("Situacao final: " + getDescricao());
		return sb;
	}
	

}
