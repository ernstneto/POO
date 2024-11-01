package aula2;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private final Cliente cliente;
	private ArrayList<ItemPedido> itens;
	private final int numero;
	private final Date data;

	public Pedido(int numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
		this.data = new Date();
		this.itens = new ArrayList<ItemPedido>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public void addItem(Produto p, int qtde) {
		itens.add(new ItemPedido(p, qtde));
	}

	public void removeItem(int index) {
		this.itens.remove(index);
	}

	public double getTotal() {
		double saldo = 0.0;

		for (ItemPedido itemPedido : itens) {
			saldo += itemPedido.getProduto().getPreco() * itemPedido.getQtde();
		}
		return saldo;
	}

	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de compras:");
		return sb;
	}

}
