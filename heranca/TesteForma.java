package heranca;

public class TesteForma {

	public static void main(String[] args) {

		Quadro q1 = new Quadro("BRANCO");

		Coordenada c1 = new Coordenada(10, 10);
		Coordenada c2 = new Coordenada(20, 20);

		Quadrado f1 = new Quadrado("BRANCO", "PRETO", c1, 100);
		Circulo f2 = new Circulo("AZUL", "AMARELO", c2, 200);
		
		Retangulo f3 = new Retangulo("BRANCO", "AZUL",new Coordenada(30, 30),  50, 75);
		
		q1.addForma(f1);
		q1.addForma(f2);
		q1.addForma(f3);
		
		q1.refresh();
	}

}
