import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteIMC {
	
	@Test
	void testBaixoPesoMuitoGrave() {
		Paciente paciente1 = new Paciente(40, 2);
		assertEquals(10, paciente1.calcularIMC(), 0.01);
	}
	
	@Test
	void testBaixoPesoGrave() {
		Paciente paciente2 = new Paciente(48, 1.73);
		assertEquals(16.03, paciente2.calcularIMC(), 0.01);
	}

	@Test
	void testBaixoPeso() {
		Paciente paciente3 = new Paciente(62, 1.86);
		assertEquals(17.92, paciente3.calcularIMC(), 0.01);
	}

	@Test
	void testPesoNormal() {
		Paciente paciente4 = new Paciente(64, 1.64);
		assertEquals(23.79, paciente4.calcularIMC(), 0.01);
	}
	
	@Test
	void testSobrepeso() {
		Paciente paciente5 = new Paciente(80, 1.70);
		assertEquals(27.68, paciente5.calcularIMC(), 0.01);
	}
	
	@Test
	void testObesidadeGrauI() {
		Paciente paciente6 = new Paciente(95, 1.75);
		assertEquals(31.02, paciente6.calcularIMC(), 0.01);
	}
	
	@Test
	void testObesidadeGrauII() {
		Paciente paciente7 = new Paciente(100, 1.65);
		assertEquals(36.73, paciente7.calcularIMC(), 0.01);
	}
	
	@Test
	void testObesidadeGrauIII() {
		Paciente paciente8 = new Paciente(140, 1.80);
		assertEquals(43.20, paciente8.calcularIMC(), 0.01);
	}
	
}
