import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * author André Morais de Azevedo
 * date 22/08/2020 21:49
 */
class TestePessoa {

	@Test
	public void testIdade1() {
		Pessoa p1 = new Pessoa("18/08/1975");
		assertEquals(45, p1.getIdade());
	}
	
	@Test
	public void testIdade2() {
		Pessoa p2 = new Pessoa("08/12/1977");
		assertEquals(42, p2.getIdade());
	}

	@Test
	public void testSigno1() {
		Pessoa p3 = new Pessoa("18/08/1975");
		assertEquals("Leão", p3.getSigno());
	}
	
	@Test
	public void testSigno2() {
		Pessoa p4 = new Pessoa("08/12/1977");
		assertEquals("Sagitário", p4.getSigno());
	}

}
