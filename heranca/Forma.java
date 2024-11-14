package heranca;

public abstract class Forma {
	private String corFundo;
	private String corBorda;
	protected Coordenada posicao;
	
	public Forma(String corFundo, String corBorda, Coordenada posicao) {
		this.corFundo = corFundo;
		this.corBorda = corBorda;
		this.posicao = posicao;
	}

	public String getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(String corFundo) {
		this.corFundo = corFundo;
	}

	public String getCorBorda() {
		return corBorda;
	}

	public void setCorBorda(String corBorda) {
		this.corBorda = corBorda;
	}

	public Coordenada getPosicao() {
		return posicao;
	}

	public void setPosicao(Coordenada posicao) {
		this.posicao.setX(posicao.getX());
		this.posicao.setY(posicao.getY());
	}
	
	public abstract void desenhar();
	
	
}
