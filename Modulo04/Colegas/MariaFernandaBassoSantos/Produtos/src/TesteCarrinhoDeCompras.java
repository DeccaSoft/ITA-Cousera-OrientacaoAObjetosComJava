import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
	void testAdicionarProdutosComCodigosDiferentes() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2235;
		prod2.preco = 25.00;
		prod2.tamanho = 38;
		
		meuCarrinho.adicionaProduto(prod1, 5);
		meuCarrinho.adicionaProduto(prod2, 2);
		assertEquals(2, meuCarrinho.mapProdutos.size());
		assertEquals(5, meuCarrinho.mapProdutos.get(prod1));
		assertEquals(2, meuCarrinho.mapProdutos.get(prod2));
	}
	
	@Test
	void testAdicionarProdutosComTamanhosDiferentes() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2233;
		prod2.preco = 25.00;
		prod2.tamanho = 40;
		
		meuCarrinho.adicionaProduto(prod1, 5);
		meuCarrinho.adicionaProduto(prod2, 2);
		assertEquals(2, meuCarrinho.mapProdutos.size());
		assertEquals(5, meuCarrinho.mapProdutos.get(prod1));
		assertEquals(2, meuCarrinho.mapProdutos.get(prod2));
	}
	
	@Test
	void testAdicionarProdutosComCodigoETamanhoIguais() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
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
		
		meuCarrinho.adicionaProduto(prod1, 5);
		meuCarrinho.adicionaProduto(prod2, 2);
		assertEquals(1, meuCarrinho.mapProdutos.size());
		assertEquals(7, meuCarrinho.mapProdutos.get(prod1));
	}
	
	@Test
	void testRemoverProduto() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 22.00;
		prod1.tamanho = 38;
		
		meuCarrinho.adicionaProduto(prod1, 5);
		meuCarrinho.removeProduto(prod1, 2);
		assertEquals(1, meuCarrinho.mapProdutos.size());
		assertEquals(3, meuCarrinho.mapProdutos.get(prod1));
	}
	
	@Test
	void testPrecoTotal() {
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		ProdutoComTamanho prod1 = new ProdutoComTamanho();
		prod1.nome = "camisa azul";
		prod1.codigo = 2233;
		prod1.preco = 20.00;
		prod1.tamanho = 38;
		
		ProdutoComTamanho prod2 = new ProdutoComTamanho();
		prod2.nome = "camisa rosa";
		prod2.codigo = 2235;
		prod2.preco = 30.00;
		prod2.tamanho = 38;
		
		meuCarrinho.adicionaProduto(prod1, 3);
		meuCarrinho.adicionaProduto(prod2, 1);
		assertEquals(90, meuCarrinho.getTotal());
	}

}
