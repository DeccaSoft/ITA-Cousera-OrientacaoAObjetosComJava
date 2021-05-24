import static org.junit.Assert.*;

import org.junit.Test;

public class TestePrincipal {

	@Test
	public void totalIngredientes() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Milho");
		p1.adicionaIngrediente("Molho");
		p1.adicionaIngrediente("Cebola");
		p1.adicionaIngrediente("Tomate");
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Tomate");
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Molho");
		p3.adicionaIngrediente("Cebola");
		p3.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Queijo");
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		c1.adicionaProduto(p2);
		c1.adicionaProduto(p3);
		assertEquals(3, (int)Pizza.ingredienteEQuantidadeTodasPizzas.get("Queijo"));
		
	}
	

}
