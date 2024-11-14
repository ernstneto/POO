package heranca;

import java.util.ArrayList;

public class Quadro {
	private String cordeFundo;
	private ArrayList<Forma>formas = new ArrayList<>();
	
	public Quadro(String cordeFundo) {
		this.cordeFundo = cordeFundo;
	}

	public String getCordeFundo() {
		return cordeFundo;
	}

	public void setCordeFundo(String cordeFundo) {
		this.cordeFundo = cordeFundo;
	}
	
	public void addForma(Forma forma) {
		formas.add(forma);
	}
	
	public void refresh() {
		System.out.println("\nFundo: " + getCordeFundo());
		
		for (Forma forma : formas) {
			forma.desenhar();
		}
	}
}
