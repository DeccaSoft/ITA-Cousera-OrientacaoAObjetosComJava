import static org.junit.Assert.*;

import org.junit.Test;

	public class TesteProduto {

		@Test
		public void testeEquals() {

				Produto produto = new Produto(2, "Camisa Social", 135);
				Produto produto1 = new Produto(2, "Terno de Linho", 1037);
				assertEquals(produto.equals(produto1), produto1.equals(produto));
		}
		
		@Test
		public void testeHashCode()
		{
			Produto produtos = new Produto(2, "Camisa Social", 135);
			Produto produtos1 = new Produto(2, "Terno de Linho", 1037);
			assertEquals(produtos.hashCode(), produtos1.hashCode());
			
		}
		

	}
	


