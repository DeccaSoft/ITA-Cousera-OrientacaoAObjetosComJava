import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	@Before
	public void limpaListaIngredientes() {
		Pizza.apagaListaIngredientes();
	}
	
	@Test
	public void semIngredientes() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		HashMap<String, Integer> q = Pizza.ingredienteEQuantidadeTodasPizzas;
		assertTrue(q.isEmpty());
	}
	
	@Test
	public void testeAdicionaIngredienteUmaPizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Queijo");
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("Queijo");
		assertTrue(ingredientes.equals(p.get_ingredientes()));
	}

	@Test
	public void adicionaUmIngredienteEmDuasPIzzas() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Queijo");
		HashMap<String, Integer> totalIngredientes = new HashMap<>();
		totalIngredientes.put("Queijo", 2);
		assertEquals(totalIngredientes, Pizza.ingredienteEQuantidadeTodasPizzas);
		
		
		
	}
	@Test
	public void adicionaUmIngredienteEmDuasPIzzasContaQueijos() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Queijo");
		assertEquals(2, (int)Pizza.ingredienteEQuantidadeTodasPizzas.get("Queijo")); 
	}
	@Test
	public void ateDoisIngredientes15reais() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		assertEquals("15 Reais", p1.getPreco());
	}
	@Test
	public void tresACincoIngredientes20reais() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Milho");
		assertEquals("20 Reais", p1.getPreco());
	}
	@Test
	public void seisOuMaisIngredientes23reais() {
		Pizza.ingredienteEQuantidadeTodasPizzas.clear();
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Azeitona");
		p1.adicionaIngrediente("Milho");
		p1.adicionaIngrediente("Molho");
		p1.adicionaIngrediente("Cebola");
		p1.adicionaIngrediente("Tomate");
		assertEquals("23 Reais", p1.getPreco());
	}
	@Test
	public void qtdDeIngredientesDistintos() {
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
		assertEquals(6, (int)Pizza.ingredienteEQuantidadeTodasPizzas.size());
	}
	

}
