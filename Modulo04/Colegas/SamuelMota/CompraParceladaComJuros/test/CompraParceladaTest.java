import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompraParceladaTest {

	@Test
	void testCompra() {
		Compra num1 = new Compra(20);
		
		assertEquals(20, num1.total());
	}
	
	@Test
	void testCompraCom1Parcela() {
		Compra num1 = new CompraParcelada(20,1,.05);
		
		assertEquals(21, num1.total());
	}
	@Test
	void testCompraCom2Parcelas() {
		Compra num1 = new CompraParcelada(20,2,.05);
		
		assertEquals(22.05, num1.total());
	}
	@Test
	void testCompraCom5Parcelas() {
		Compra num1 = new CompraParcelada(20,5,.05);
		
		assertEquals(25.53, num1.total(), 9.99);
	}
	@Test
	void testCompraCom10Parcelas() {
		Compra num1 = new CompraParcelada(20,10,.05);
		
		assertEquals(32.58, num1.total(), 9.99);
	}
}
