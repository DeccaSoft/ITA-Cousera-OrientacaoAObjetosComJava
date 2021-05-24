import java.util.HashSet;
import java.util.Set;

public class CarrinhoDeCompras {
	int total = 0;
	Set<Pizza> pizzas = new HashSet<Pizza>();
	
	public void adicionar (Pizza pizza) {
		if (pizza.getPreco() == 0) System.out.println("Erro, adicione pelo menos um ingrediente na pizza");
		else pizzas.add(pizza);
	}
	
	public int total () {
		for (Pizza pizza : pizzas) {
			total = total + pizza.getPreco();
		}
		return total;
	}
}
