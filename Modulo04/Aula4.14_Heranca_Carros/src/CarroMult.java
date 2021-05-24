
public class CarroMult extends CarroCorrida {
	
	private double potencia;
	
	public CarroMult(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		if(potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		}else {
			potencia = 1.5;
		}
	}

	@Override
	public void acelerar() {
		if(velocidade == 0) {
			velocidade = 10;
		}else {
			velocidade *= potencia;
			if(velocidade > velocidadeMaxima) {
				velocidade = velocidadeMaxima;
			}
		}
	}

}
