import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProduto {

	@Test
	void testTudoIgual() {
		Produto prod1 = new Produto();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		
		Produto prod2 = new Produto();
		prod2.nome = "camisa azul";
		prod2.codigo = 2233;
		prod2.preco = 22.00;
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	void testCodigoIgualPrecoDiferente() {
		Produto prod1 = new Produto();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		
		Produto prod2 = new Produto();
		prod2.nome = "camisa azul";
		prod2.codigo = 2233;
		prod2.preco = 25.00;
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	void testCodigoIgualNomeDiferente() {
		Produto prod1 = new Produto();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		
		Produto prod2 = new Produto();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2233;
		prod2.preco = 22.00;
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	void testSomenteCodigoIgual() {
		Produto prod1 = new Produto();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		
		Produto prod2 = new Produto();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2233;
		prod2.preco = 25.00;
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	void testSoOCodigoDiferente() {
		Produto prod1 = new Produto();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		
		Produto prod2 = new Produto();
		prod2.nome = "camisa azul";
		prod2.codigo = 2235;
		prod2.preco = 22.00;
		assertFalse(prod1.equals(prod2));
	}

}
