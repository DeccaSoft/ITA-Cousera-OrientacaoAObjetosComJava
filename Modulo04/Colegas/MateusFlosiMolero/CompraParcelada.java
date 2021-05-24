import java.lang.Math;

public class CompraParcelada extends Compra
{
    public int parcelas;
    public double juros;

    public CompraParcelada(double valor, int parcelas, double juros)
    {
        super(valor);
        this.parcelas = parcelas;
        this.juros = juros;
    }

    public double total()
    {
        return super.total()*Math.pow((1+juros),parcelas);
    }
    
    public void setParcelas(int parcelas)
    {
        this.parcelas = parcelas;
    }
    
    public void setJuros(double juros)
    {
        this.juros = juros;
    }
}