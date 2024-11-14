package heranca;

public class Quadrado extends Forma{
	private int lado;
	
	public Quadrado(String corFundo, String corBorda, Coordenada posicao, int lado) {
		super(corFundo,corBorda,posicao);
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public void desenhar() {
		System.out.println("QUADRADO:\nCordeFundo: " + getCorFundo() + "\nCordeBorda: " + getCorBorda() + "\nCoordenada: " + posicao.toString() + "\nlado: " + getLado());
	}
}
