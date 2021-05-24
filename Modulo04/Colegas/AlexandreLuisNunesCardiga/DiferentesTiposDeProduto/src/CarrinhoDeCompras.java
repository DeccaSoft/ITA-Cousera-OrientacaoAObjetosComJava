import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private static double total= 0;
	private static int qtdNoCarrinho;	
	static  Map<Produto, Integer> carrinho = new HashMap<>();
	
	public void adicionaProduto(Produto produto, int qtd)
	{   	
		if (carrinho.containsKey(produto))
		{   int saldo = carrinho.get(produto);
			carrinho.put(produto, qtd+saldo);
		}
		else
		{ carrinho.put(produto, qtd);
		
		}
	
		qtdNoCarrinho += qtd;
		
	}


	public void removeProduto(Produto produto, int qtd)
	{   			
		if (carrinho.containsKey(produto))
		{
			int saldo = carrinho.get(produto);
			if (qtd > saldo)
			  {System.out.println("Sem saldo para remover!!");							
			  }
			else
				if (qtd == saldo)	
				  { carrinho.remove(produto);
				    qtdNoCarrinho -= qtd;  }
				else
				  { carrinho.remove(produto);
				    carrinho.put(produto, (saldo-qtd));
					qtdNoCarrinho -= qtd;	
				  }	

		}
	}
	
// retorna preço total da compras no carrinho
	public double getPrecoTotalCarrinho()
	{   double  total= 0.0;
		for(Produto produto : carrinho.keySet() )
		{
			total = total + produto.getPreco() * carrinho.get(produto);
  
         }
		return total;
	}
	
// getters e setters	
	public HashMap<Produto, Integer> getCarrinho() {
		return (HashMap<Produto, Integer>) carrinho;
	}

	public void setCarrinho(HashMap<Produto, Integer> carrinho) {
		this.carrinho = carrinho;
	}

	public static int getQtdNoCarrinho() {
		return qtdNoCarrinho;
	}

	public static void setQtdNoCarrinho(int qtdNoCarrinho) {
		CarrinhoDeCompras.qtdNoCarrinho = qtdNoCarrinho;
	}	

	
}


