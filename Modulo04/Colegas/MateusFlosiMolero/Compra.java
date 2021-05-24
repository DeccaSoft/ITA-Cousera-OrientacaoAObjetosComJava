public class Compra
{
    public double valor;

    public Compra(double valor)
    {
        this.valor = valor;
    }

    public double total()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
}