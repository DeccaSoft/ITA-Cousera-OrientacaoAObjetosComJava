import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.CompraParcelada;

public class TestadorCompraParcelada {

	//Crie testes de unidade para 1, 2, 5 e 10 parcelas.
	
	CompraParcelada _compraParcelada;
	
	@Before
	public void criacaoObjetoCompraParcelada() {
		_compraParcelada = new CompraParcelada(100f, 1, 0.10f);
	}
	
	@Test
	public void testeUmaParcela() {
		assertEquals(110, _compraParcelada.total(), 1);	
	}
	
	@Test
	public void testeDuasParcelas() {
		_compraParcelada.setParcelas(2);
		assertEquals(121, _compraParcelada.total(), 1);	
	}

	@Test
	public void testeCincoParcelas() {
		_compraParcelada.setParcelas(5);
		assertEquals(161, _compraParcelada.total(), 1);	
	}
	
	@Test
	public void testeDezParcelas() {
		_compraParcelada.setParcelas(10);
		assertEquals(259, _compraParcelada.total(), 1);	
	}
}
