
public class CompraParcelada extends Compra {
	private int qtdparcelas=0;
	private double jurosmensal=0;
	
	public CompraParcelada(double valorcompra,int qtdparcelas, double jurosmensal) {
		super(valorcompra);
		this.qtdparcelas = qtdparcelas;
		this.jurosmensal = jurosmensal;
	}
	
	public double total() {
		double montante =0;
		montante = super.total()*Math.pow( (1.0 + jurosmensal),qtdparcelas);
		return montante;
	}
}
