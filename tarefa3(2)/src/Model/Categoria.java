package Model;

import java.util.ArrayList;

public class Categoria {
	private final String nome;
	private ArrayList<Item>itens = new ArrayList<>();
	
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}
	
	public StringBuilder listaritens() {
		StringBuilder sb = new StringBuilder();
		
		return sb;
	}
	
}
