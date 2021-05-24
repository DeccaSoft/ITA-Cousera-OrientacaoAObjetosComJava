import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestePizza {

	@Test
	void testPizzaCom1Ingrediente() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		assertEquals(15, pizza1.getPreco());
	}
	
	@Test
	void testPizzaCom3Ingredientes() {
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Cebola");
		assertEquals(20, pizza2.getPreco());
	}
	
	@Test
	void testPizzaCom6Ingredientes() {
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Palmito");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Ervilha");
		pizza3.adicionaIngrediente("Presunto");
		assertEquals(23, pizza3.getPreco());
	}
	
	@Test
	void testCarrinhoDeCompras() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		meuCarrinho.adicionar(pizza1);
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Cebola");
		meuCarrinho.adicionar(pizza2);
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Palmito");
		pizza3.adicionaIngrediente("Milho");
		pizza3.adicionaIngrediente("Ervilha");
		pizza3.adicionaIngrediente("Presunto");
		meuCarrinho.adicionar(pizza3);
		
		assertEquals(3, meuCarrinho.pizzas.size());
		assertEquals(58, meuCarrinho.total());
	}
	
	@Test
	void testCarrinhoDeComprasPizzaSemIngredientes() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Mussarela");
		meuCarrinho.adicionar(pizza1);
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Cebola");
		meuCarrinho.adicionar(pizza2);
		
		Pizza pizza3 = new Pizza();
		meuCarrinho.adicionar(pizza3);
		
		assertEquals(2, meuCarrinho.pizzas.size());
		assertEquals(35, meuCarrinho.total());
	}

}
