import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

	@Test
	void testSomenteCodigoETamanhoIguais() {
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2233;
		prod2.preco = 25.00;
		prod2.tamanho = 38;
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	void testTudoIgualMenosOTamanho() {
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa azul";
		prod2.codigo = 2233;
		prod2.preco = 22.00;
		prod2.tamanho = 40;
		assertFalse(prod1.equals(prod2));
	}
	
	@Test
	void testTudoIgualMenosOCodigo() {
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa azul";
		prod2.codigo = 2235;
		prod2.preco = 22.00;
		prod2.tamanho = 38;
		assertFalse(prod1.equals(prod2));
	}

}
