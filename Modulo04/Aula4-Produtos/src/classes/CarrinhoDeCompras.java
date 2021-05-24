package classes;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author André Morais de Azevedo
 * @Date 19/08/2020 14:50
 *
 */
public class CarrinhoDeCompras {

	public Map<ProdutoComTamanho, Integer> produtos = new HashMap<>();
	public double total = 0;
	
	public void adicionaProduto(ProdutoComTamanho produto, Integer quantidade) {
		if (produtos.containsKey(produto)) {
			produtos.put(produto, produtos.get(produto) + quantidade);
		}else {
			produtos.put(produto, quantidade);
		}

	}
	
	public void removeProduto(ProdutoComTamanho produto, Integer quantidade) {
		if(produtos.containsKey(produto)) {
			produtos.put(produto, produtos.get(produto) - quantidade);
		}
	}
	
	public double calculaTotalCarrinho() {
		for(ProdutoComTamanho produto : produtos.keySet()) {
			total += produto.preco * produtos.get(produto);
		}
		return total;
	}
}
