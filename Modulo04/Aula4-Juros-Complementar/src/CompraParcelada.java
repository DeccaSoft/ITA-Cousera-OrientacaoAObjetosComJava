
public class CompraParcelada extends Compra {
	
	private int qtdParcelas;
	private double juros;
	
	public CompraParcelada(double valor, int qtdParcelas, double juros) {
		super(valor);
		this.qtdParcelas = qtdParcelas;
		this.juros = juros;
	}

	@Override
	public double total() {
		double Montante = super.total() * Math.pow((1 + juros), qtdParcelas); 
		return super.total();
	}
	
	

}
