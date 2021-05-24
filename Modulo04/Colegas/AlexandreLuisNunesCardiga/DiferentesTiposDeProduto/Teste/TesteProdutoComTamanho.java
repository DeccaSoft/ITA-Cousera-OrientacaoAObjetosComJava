import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testeEquals() {

			Produto produto = new ProdutoComTamanho(1, "Tenis B.", 2,200);
			Produto produto1 = new ProdutoComTamanho(1, "Chinelo", 1, 50);
			assertEquals(produto.equals(produto1), produto1.equals(produto));
	}

	@Test
	public void testeHashCode()
	{
		Produto produtos = new ProdutoComTamanho(1, "Cinto", 2,142);
		Produto produtos1 = new ProdutoComTamanho(1, "Tenis B.", 2,200);
		assertEquals(produtos.hashCode(), produtos1.hashCode());
		
	}


}
