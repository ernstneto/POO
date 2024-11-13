package Model;

public class ItemOS {
	private int qtde;
	private double preco;
	private Item item;

	public ItemOS(int qtde, double preco, Item item) {
		super();
		this.qtde = qtde;
		this.preco = preco;
		this.item = item;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Item getItem() {
		return item;
	}
}
