package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.Produto;

class TesteProduto {
	/**
	 * 
	 * @author André Morais de Azevedo
	 * @Date 19/08/2020 14:50
	 *
	 */	
	@Test
	void testCodigoIgual() {
		Produto produto1 = new Produto();
		produto1.nome = "Blusa Lisa";
		produto1.codigo = 2222;
		produto1.preco = 24.00;
		
		Produto produto2 = new Produto();
		produto2.nome = "Blusa Estampada";
		produto2.codigo = 2222;
		produto2.preco = 39.00;
		assertTrue(produto1.equals(produto2));
	}
	
	@Test
	void testNomeIgual() {
		Produto produto1 = new Produto();
		produto1.nome = "Bermuda";
		produto1.codigo = 3333;
		produto1.preco = 19.00;
		
		Produto produto2 = new Produto();
		produto2.nome = "Bermuda";
		produto2.codigo = 4444;
		produto2.preco = 29.00;
		assertFalse(produto1.equals(produto2));
	}
	
	@Test
	void testPrecoIgual() {
		Produto produto1 = new Produto();
		produto1.nome = "Gravata Amarela";
		produto1.codigo = 5555;
		produto1.preco = 19.00;
		
		Produto produto2 = new Produto();
		produto2.nome = "Gravata Vermelha";
		produto2.codigo = 6666;
		produto2.preco = 19.00;
		assertFalse(produto1.equals(produto2));
	}
	
	@Test
	void testProdutosDiferentes() {
		Produto produto1 = new Produto();
		produto1.nome = "Camisa Polo";
		produto1.codigo = 7777;
		produto1.preco = 25.00;
		
		Produto produto2 = new Produto();
		produto2.nome = "Calça Social";
		produto2.codigo = 8888;
		produto2.preco = 99.00;
		assertFalse(produto1.equals(produto2));
	}
	
	@Test
	void testProdutosIguais() {
		Produto produto1 = new Produto();
		produto1.nome = "Calça Jeans";
		produto1.codigo = 1111;
		produto1.preco = 59.00;
		
		Produto produto2 = new Produto();
		produto2.nome = "Calça Jeans";
		produto2.codigo = 1111;
		produto2.preco = 59.00;
		assertTrue(produto1.equals(produto2));
	}

}
