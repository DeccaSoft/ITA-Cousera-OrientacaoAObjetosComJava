import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestePizza {

	@Before
	public void limpRegistroPedidos() {
		Pizza.zerarIngredientes();
	}
	

	@Test
	public void testPizza1() {
		Pizza p1 = new Pizza(); 
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Milho");
		
		assertEquals(3, p1.lista.size()); 
	}
	
	@Test
	public void testPizza2() {
		Pizza p2 = new Pizza(); 
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Molho");
		p2.adicionaIngrediente("Cebola");
		
		assertEquals(4, p2.lista.size()); 
	}
	
	@Test
	public void testPizza3() {
		Pizza p3 = new Pizza(); 
		p3.adicionaIngrediente("Tomate");
		
		
		assertEquals(1, p3.lista.size()); 
	}
	

	@Test
	public void testListaIngredientes() {
		Pizza p4 = new Pizza(); 
		p4.adicionaIngrediente("Tomate");
		p4.adicionaIngrediente("Queijo");
		p4.adicionaIngrediente("Molho");
		p4.adicionaIngrediente("Cebola");
		
		List <String> lista = new ArrayList<String>(); 
		lista.addAll(p4.lista); 
		
		assertEquals(lista, p4.lista); 
		
	}

}
