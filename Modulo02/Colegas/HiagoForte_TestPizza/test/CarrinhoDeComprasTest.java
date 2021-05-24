import static org.junit.Assert.*;

import org.junit.Test;

import com.coursera.object.CarrinhoDeCompras;
import com.coursera.object.Pizza;

public class CarrinhoDeComprasTest {

	// verifica o pre�o
	@Test
	public void verificarPreco() {
		Pizza p1 = new Pizza();

		p1.adicionaIngrediente("Musarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Atum");
		p1.adicionaIngrediente("Frango");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(p1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}

	// verifica a adi��o de pizzas
	@Test
	public void verificaSeEstaVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}

}
