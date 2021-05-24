import java.util.ArrayList;

public class CarrinhoDeCompras {

	ArrayList<Pizza> produtos = new ArrayList<>();

	public void adicionaProduto(Pizza p1) {
		if (p1.get_ingredientes().size() == 0)
			return;
		produtos.add(p1);
		return;

	}

	public ArrayList<Pizza> getProdutos() {
		return produtos;
	}

	public String valorTotal() {
		int precoTotal = 0;
		for (Pizza produto : produtos) {
			if (produto.getPreco().contentEquals("15 Reais"))
				precoTotal += 15;
			else if (produto.getPreco().contentEquals("20 Reais"))
				precoTotal += 20;
			else
				precoTotal += 23;
		}
		return "Valor total: " + precoTotal + " Reais";
	}

}
