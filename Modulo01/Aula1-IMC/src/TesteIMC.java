import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TesteIMC {

	@Test
	void testeIMC() {
		Paciente p = new Paciente(74.0, 1.7);
		assertEquals(25.60, p.calcularIMC(), 0.1);
	}


}
