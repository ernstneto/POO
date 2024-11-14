package heranca;

public class Circulo extends Forma{
	private int raio;
	
	public Circulo(String cordeFundo, String cordeBorda, Coordenada posicao, int raio) {
		super(cordeBorda,cordeFundo,posicao);
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public void desenhar() {
		System.out.println("CIRCULO:\nCordeFundo: " + getCorFundo() + "\nCordeBorda: " + getCorBorda() + "\nCoordenada: " + posicao.toString() + "\nraio: " + getRaio());
	}

}
