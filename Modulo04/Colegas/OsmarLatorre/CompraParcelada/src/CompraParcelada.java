
public class CompraParcelada extends Compra {
	private int numParcelas;
    private float jurosMensal;
    protected double valorTotal;

    public CompraParcelada(double valor, int numParcelas, float jurosMensal) {
        super(valor);
        this.numParcelas = numParcelas;
        this.jurosMensal = jurosMensal;
    }

    @Override
    public double retornaTotal(){

        this.valorTotal = super.valor * (Math.pow((1.0 + this.jurosMensal / 100), numParcelas));

        return Math.round(this.valorTotal * 100) / 100.00;
    }
}
