package teste;
/**
 * 
 * @author André Morais de Azevedo
 * @Date 19/08/2020 14:50
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.CarrinhoDeCompras;
import classes.ProdutoComTamanho;

class TesteCarrinho {

	
	@Test
	void testProdutosIguais() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Cal�a";
		produto1.codigo = 1111;
		produto1.preco = 39.00;
		produto1.tamanho = 40;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Cal�a";
		produto2.codigo = 1111;
		produto2.preco = 39.00;
		produto2.tamanho = 40;
		
		carrinho.adicionaProduto(produto1, 4);
		carrinho.adicionaProduto(produto2, 4);
		assertEquals(1, carrinho.produtos.size());
		assertEquals(8, carrinho.produtos.get(produto1));
	}
	
	@Test
	void testCodigoDiferente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Bermuda";
		produto1.codigo = 2222;
		produto1.preco = 29.00;
		produto1.tamanho = 40;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Bermuda";
		produto2.codigo = 3333;
		produto2.preco = 29.00;
		produto2.tamanho = 40;
		
		carrinho.adicionaProduto(produto1, 4);
		carrinho.adicionaProduto(produto2, 4);
		assertEquals(2, carrinho.produtos.size());
		assertEquals(4, carrinho.produtos.get(produto1));
		assertEquals(4, carrinho.produtos.get(produto2));
	}
	
	@Test
	void testTamanhoDiferente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Camisa Social";
		produto1.codigo = 4444;
		produto1.preco = 49.00;
		produto1.tamanho = 38;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Camisa Social";
		produto2.codigo = 4444;
		produto2.preco = 49.00;
		produto2.tamanho = 40;
		
		carrinho.adicionaProduto(produto1, 4);
		carrinho.adicionaProduto(produto2, 4);
		assertEquals(2, carrinho.produtos.size());
		assertEquals(4, carrinho.produtos.get(produto1));
		assertEquals(4, carrinho.produtos.get(produto2));
	}

	
	@Test
	void testRemocaoProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Gravata";
		produto1.codigo = 5555;
		produto1.preco = 19.00;
		produto1.tamanho = 8;
		
		carrinho.adicionaProduto(produto1, 10);
		carrinho.removeProduto(produto1, 5);
		assertEquals(1, carrinho.produtos.size());
		assertEquals(5, carrinho.produtos.get(produto1));
	}
	
	@Test
	void testTotalCarrinho() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho();
		produto1.nome = "Blusa";
		produto1.codigo = 6666;
		produto1.preco = 30.00;
		produto1.tamanho = 36;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho();
		produto2.nome = "Short";
		produto2.codigo = 7777;
		produto2.preco = 40.00;
		produto2.tamanho = 38;
		
		carrinho.adicionaProduto(produto1, 10);
		carrinho.adicionaProduto(produto2, 10);
		assertEquals(700, carrinho.calculaTotalCarrinho());
	}


}
