package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.ProdutoComTamanho;

class TesteProdutoComTamanho {
	/**
	 * 
	 * @author André Morais de Azevedo
	 * @Date 19/08/2020 14:50
	 *
	 */
	
	@Test
	void testTamanhoDiferente() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Calça Jeans";
		produto1.codigo = 2222;
		produto1.preco = 22.00;
		produto1.tamanho = 42;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Calça Jeans";
		produto2.codigo = 2222;
		produto2.preco = 22.00;
		produto2.tamanho = 44;
		assertFalse(produto1.equals(produto2));
	}
	
	@Test
	void testCodigoDiferente() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Blusa Feminia";
		produto1.codigo = 3333;
		produto1.preco = 24.00;
		produto1.tamanho = 36;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Blusa Feminia";
		produto2.codigo = 4444;
		produto2.preco = 24.00;
		produto2.tamanho = 36;
		assertFalse(produto1.equals(produto2));
	}


	@Test
	void testCodigoTamanhoIguais() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Short Sarja";
		produto1.codigo = 1111;
		produto1.preco = 29.00;
		produto1.tamanho = 40;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Short Jeans";
		produto2.codigo = 1111;
		produto2.preco = 25.00;
		produto2.tamanho = 40;
		assertTrue(produto1.equals(produto2));
	}

}
