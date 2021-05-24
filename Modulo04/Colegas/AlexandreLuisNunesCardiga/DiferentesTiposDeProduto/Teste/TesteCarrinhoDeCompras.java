import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {
	//adiciona no carrinho
	@Test
	public void testeAdicionaNoCarrinho()
	{
		Produto produto = new Produto(12, "Blusão Vermelho", 15);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(produto, 5);
		assertEquals(5,CarrinhoDeCompras.getQtdNoCarrinho());
		
		Produto produtos = new Produto(15, "Camiseta", 50);
		CarrinhoDeCompras carrinhos = new CarrinhoDeCompras();
		carrinhos.adicionaProduto(produtos, 2);
		assertEquals(7,CarrinhoDeCompras.getQtdNoCarrinho());
		
		Produto produtos_ = new Produto(15, "Camiseta", 50);
		CarrinhoDeCompras carrinhos_ = new CarrinhoDeCompras();
		carrinhos_.adicionaProduto(produtos_, 2);
		assertEquals(9,CarrinhoDeCompras.getQtdNoCarrinho());
		
	    //Valor total no carrinho de compras
		double total = carrinho.getPrecoTotalCarrinho();
		assertEquals(275.00, total, 00.00);		

	}
	
 	//remove do carrinho
	@Test
	public void testeRemoveNoCarrinho()
	{
			Produto produto = new Produto(12, "Blusão Vermelho", 15);
			CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
			carrinho.removeProduto(produto, 2);
			assertEquals(7,CarrinhoDeCompras.getQtdNoCarrinho());
			
			
		    //Valor total no carrinho de compras
			double total = carrinho.getPrecoTotalCarrinho();
			assertEquals(245.00, total, 00.00);		
				
		}
}
