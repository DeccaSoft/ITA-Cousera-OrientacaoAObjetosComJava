import static org.junit.Assert.*;

import org.junit.Test;

public class TestedeCompraParceladaComJuros {

	@Test
	public void test1Parcela() {
		Compra c1 = new CompraParcelada(100.0,1,0.05);
		assertEquals(105.0,c1.total(),0.01);
	}

	@Test
	public void test2Parcelas() {
		Compra c1 = new CompraParcelada(100.0,2,0.05);
		assertEquals(110.25,c1.total(),0.01);
	}
	
	@Test
	public void test5Parcelas() {
		Compra c1 = new CompraParcelada(100.0,5,0.05);
		assertEquals(127.63,c1.total(),0.01);
	}

	@Test
	public void test10Parcelas() {
		Compra c1 = new CompraParcelada(100.0,10,0.05);
		assertEquals(162.89,c1.total(),0.01);		
	}
	
}
