
public class Compra {
	
	private double valor;
	private double total = 0;
	
	public Compra(double valor) {
		this.valor = valor;
	}
	
	public double total() {
		total += valor;
		return total;
	}

	public double getValor() {
		return valor;
	}
	
	
}
