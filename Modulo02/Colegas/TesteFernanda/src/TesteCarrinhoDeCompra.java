import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompra {

	@Test
	void testCarrinhoPreco1() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Cebola");
		p1.adicionaIngrediente("Queijo");
		
		carrinhoDeCompras c = new carrinhoDeCompras(); 
		c.adicionarPizza(p1);
		
		assertEquals(20.0, c.precoPagar()); 
		assertEquals(3, p1.contador); 
	}
	@Test
	void testCarrinhoPreco2() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Orégano");
		p2.adicionaIngrediente("Ovo");
		p2.adicionaIngrediente("Molho Tomate");
		
		carrinhoDeCompras c = new carrinhoDeCompras(); 
		c.adicionarPizza(p2);
		
		assertEquals(23.0, c.precoPagar()); 
		assertEquals(6, p2.contador); 
	}
		@Test
		void testCarrinhoPreco3() {
			Pizza p3 = new Pizza();
			p3.adicionaIngrediente("Tomate");
			
			carrinhoDeCompras c = new carrinhoDeCompras(); 
			c.adicionarPizza(p3);
			
			assertEquals(15.0, c.precoPagar()); 
			assertEquals(1, p3.contador); 
	}
}
