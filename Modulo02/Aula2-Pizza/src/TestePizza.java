import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TestePizza {
	
	@BeforeClass
	void testBefore() {
		Pizza.zerarListaIngredientes();
	}
	
	@Test
	void test() {
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Tomate");
		
		pizza.getPreco();
		
		System.out.println("Valor da Pizza: " + pizza.precoPizza);
		assertEquals(15, pizza.precoPizza); 
		System.out.println("Listagem de Ingredientes: " + Pizza.mapaIngredientes);
	}
	
	@Test
	void test2() {
		
		Pizza pizza = new Pizza();
		
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Calabresa");
		
		pizza.getPreco();
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		c.adicionarPizza(pizza);
		
		System.out.println("Valor Total da Compra: " + c.valorTotal);
		assertEquals(20, pizza.precoPizza); 
		System.out.println("Quantidade de Pizzas: " + c.qtdPizzas);
		
	}
}
