/**
 * 
 * @author André Morais de Azevedo
 * @date 09/08/2020 - 13:49
 */
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Pizza> pizzas = new ArrayList<>();
	double preco=0;
	double valorTotal=0;
	int qtdPizzas=0;

	public void adicionarPizza(Pizza p) {
		if(p.precoPizza == 0) {
			System.out.println("Pizza sem ingredientes!");
		}else {
			this.pizzas.add(p);
			this.preco = p.precoPizza;
			qtdPizzas++;
			calculaTotal();
		}
	}
	
	public double calculaTotal() {
		valorTotal += this.preco;
		return valorTotal;
	}
	
}
