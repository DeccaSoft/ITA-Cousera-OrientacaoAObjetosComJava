import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.coursera.object.Pizza;

public class PizzaTest {

	// limpa a lista de ingredientes
	@Before
	public void limparRegPizza() {
		Pizza.zeraIngredientes();
	}

	// verifica se o valor está correto
	@Test
	public void valorCorreto() {
		Pizza p1 = new Pizza();

		p1.adicionaIngrediente("Musarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Atum");
		p1.adicionaIngrediente("Frango");

		assertEquals(4, p1.getIngrediente().size());
	}

	// verifica se o registro funcionou corretamente
	@Test
	public void testIngredientes() {
		Pizza p1 = new Pizza();

		p1.adicionaIngrediente("Musarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Atum");
		p1.adicionaIngrediente("Frango");

		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(p1.getIngrediente());

		assertEquals(ingredientes, p1.getIngrediente());
	}

}
