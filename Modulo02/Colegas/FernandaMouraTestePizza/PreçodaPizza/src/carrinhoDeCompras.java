import java.util.List; 
import java.util.ArrayList; 
									// considerar que todas as pizzas possuem ingredientes. 
public class carrinhoDeCompras { // saber a quantidade total de pizzas e os ingredientes. 

	public List<Pizza> pizza = new ArrayList<Pizza>(); 
	public double precoTotal = 0; 
	
	public void adicionarPizza(Pizza p) {
		pizza.add(p); 
		if (p.contador > 0) {
			pizza.add(p); 		// adionar pizzas. 
		}
	}
	
		public int quantidadePizza() {
			return pizza.size(); 			// quantidade total de pizzas. 
	}
		public double precoPagar() {
			for (int i=0; i < pizza.size(); i++) {
				precoTotal += pizza.get(i).getPreco();		// valor pago get lista de Pizzas e p preço de cada ingrediente. 
			}
			return precoTotal; 
		}
		
}

