
public class CompraParcelada extends Compra {

	private int qtdParcelas;
	private double jurosMensal;

	public CompraParcelada(double valorCompra, int qtdParcelas, double jurosMensal) {
		super(valorCompra);
		
		this.qtdParcelas = qtdParcelas;
		this.jurosMensal = jurosMensal;
	}
	
	public double total() {
//		Montante (M) - Capital (C) - Taxa (i) - Período de tempo (t)
//		M = C * (1 + i) elevado a t
		double totalComJuros = 0;
		
		totalComJuros = valorCompra * Math.pow((1 + jurosMensal), qtdParcelas);
		
		return totalComJuros;
	}

}
