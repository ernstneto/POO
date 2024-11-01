package aula2;

public class ItemPedido {
	private int qtde;
	private final Produto produto;

	public ItemPedido(Produto produto, int qtde) {
		this.produto = produto;
		this.qtde = qtde;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

}
