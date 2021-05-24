package principal;

//Crie uma subclasse chamada CompraParcelada que estende a classe Compra. Essa classe deve receber no construtor também as informações da quantidade de parcelas e o juros mensal. Crie uma nova implementação do método total() na subclasse que faz o cálculo utilizando juros compostos.

public class CompraParcelada extends Compra {
	
	int parcelas;
	float jurosMensal;
	
	public CompraParcelada(Float valor, int parcelas, float jurosMensal) {
		super(valor);
		this.parcelas = parcelas;
		this.jurosMensal = jurosMensal;
	}
	
	@Override
	public float total() {
		
		return (float) (valor * Math.pow((1 + jurosMensal), parcelas));
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
			

	

}



//Diferente dos juros simples, o juro composto é calculado sobre o montante obtido no período anterior. Somente no primeiro período é que os juros são calculados sobre o capital inicial.
//
//Através da fórmula abaixo, poderemos calcular o montante adquirido ao longo do tempo em que certa quantia fica submetida ao regime de juros compostos.
//
//Montante (M) - Capital (C) - Taxa (i) - Período de tempo (t)
//
//M = C * (1 + i) elevado a t
