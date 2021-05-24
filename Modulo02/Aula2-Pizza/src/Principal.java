/**
 * 
 * @author André Morais de Azevedo
 * @date 09/08/2020 - 13:49
 */
public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("Tomate");
		p1.getPreco();
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Cebola");
		p2.getPreco();
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Tomate");
		p3.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Azeitona");
		p3.adicionaIngrediente("Or�gano");
		p3.adicionaIngrediente("Catupiry");
		p3.getPreco();

		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionarPizza(p1);
		c.adicionarPizza(p2);
		c.adicionarPizza(p3);
		
		System.out.println("Valor Total da Compra: " + c.valorTotal);
		System.out.println("Quantidade de Pizzas: " + c.qtdPizzas);
		System.out.println("Listagem de Ingredientes: " + Pizza.mapaIngredientes);

	}

}
