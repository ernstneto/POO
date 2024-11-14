package heranca;

public class Retangulo extends Forma{
	private int base;
	private int altura;
	
	public Retangulo(String cordeFundo, String cordeBorda, Coordenada posicao, int base, int altura) {
		super(cordeBorda,cordeFundo,posicao);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void desenhar() {
		System.out.println("RETANGULO:\nCordeFundo: " + getCorFundo() + "\nCordeBorda: " + getCorBorda() + "\nCoordenada: " + posicao.toString() + "\nbase: " + getBase() + "\naltura: " + getAltura());
	}

}
