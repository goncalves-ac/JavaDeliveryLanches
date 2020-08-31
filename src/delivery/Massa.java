package delivery;

public class Massa extends Lanche {

	@Override
	public int calculaTempo (int distancia) {
		return super.calculaTempo(distancia) + 30;
	}
	
}
