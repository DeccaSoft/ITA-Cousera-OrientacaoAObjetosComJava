import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {


	@Test
	public void adicionaUmaPizzaCarrinho() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Milho");
		p1.adicionaIngrediente("Molho");
		p1.adicionaIngrediente("Cebola");
		p1.adicionaIngrediente("Tomate");
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		assertTrue(p1.equals(c1.getProdutos().get(0)));
	}
	@Test
	public void nãoAceitaPizzaSemIngrediente() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		assertTrue(c1.getProdutos().isEmpty());
	}
	@Test
	public void somaDuasPizzasValor() {
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
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		c1.adicionaProduto(p2);
		assertEquals("Valor total: 38 Reais", c1.valorTotal());
		
	}
	@Test
	public void somaTresPizzasValor() {
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
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		c1.adicionaProduto(p2);
		c1.adicionaProduto(p3);
		assertEquals("Valor total: 58 Reais", c1.valorTotal());
		
	}
	@Test
	public void adicionaTresPizzasUmaSemIngredientes() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Milho");
		p1.adicionaIngrediente("Molho");
		p1.adicionaIngrediente("Cebola");
		p1.adicionaIngrediente("Tomate");
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Molho");
		p3.adicionaIngrediente("Cebola");
		p3.adicionaIngrediente("Tomate");
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p1);
		c1.adicionaProduto(p2);
		c1.adicionaProduto(p3);
		assertEquals("Valor total: 43 Reais", c1.valorTotal());
		
	}

}
