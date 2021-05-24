
public abstract class CarroCorrida {

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	
	public void frear() {
		velocidade /= 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

}
