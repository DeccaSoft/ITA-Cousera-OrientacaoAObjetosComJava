import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
/**
 * 
 * @author André Morais de Azevedo
 * @Date 13/08/2020 21:23
 *
 */
class IMC_Teste {

	@Test
	void testMuitoGrave() {
		Paciente p = new Paciente(40.0, 1.60);
		assertEquals(15.62, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testGrave() {
		Paciente p = new Paciente(42.0, 1.60);
		assertEquals(16.40, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testBaixoPeso() {
		Paciente p = new Paciente(45.0, 1.62);
		assertEquals(17.14, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testNormal() {
		Paciente p = new Paciente(58.0, 1.55);
		assertEquals(24.14, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testSobrepeso() {
		Paciente p = new Paciente(74.0, 1.7);
		assertEquals(25.60, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testObesidade1() {
		Paciente p = new Paciente(100.0, 1.7);
		assertEquals(34.60, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testObesidade2() {
		Paciente p = new Paciente(110.0, 1.72);
		assertEquals(37.18, p.calcularIMC(), 0.1);
	}
	
	@Test
	void testObesidade3() {
		Paciente p = new Paciente(100.0, 1.35);
		assertEquals(54.86, p.calcularIMC(), 0.1);
	}
	


}
