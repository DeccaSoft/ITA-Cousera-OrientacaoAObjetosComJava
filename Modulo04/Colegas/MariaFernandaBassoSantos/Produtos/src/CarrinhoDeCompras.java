import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	double total = 0;
	Map<ProdutoComTamanho, Integer> mapProdutos = new HashMap<ProdutoComTamanho, Integer>();
	void adicionaProduto (ProdutoComTamanho prod, Integer quantidade) {
		if (!mapProdutos.containsKey(prod)) mapProdutos.put(prod, 0);
		mapProdutos.put(prod, mapProdutos.get(prod) + quantidade);
	}
	void removeProduto(ProdutoComTamanho prod, Integer quantidade) {
			if (mapProdutos.containsKey(prod)) mapProdutos.put(prod, mapProdutos.get(prod) - quantidade);
				
	}
	double getTotal() {
		for (ProdutoComTamanho produto : mapProdutos.keySet()) {
			total = total + produto.preco*mapProdutos.get(produto);
		}
		return total;
	}
}
