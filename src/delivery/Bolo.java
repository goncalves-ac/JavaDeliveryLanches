package delivery;

public class Bolo extends Lanche {
	
	@Override
	public int calculaTempo (int distancia) {
		return super.calculaTempo(distancia + 10);
	}
	
}
