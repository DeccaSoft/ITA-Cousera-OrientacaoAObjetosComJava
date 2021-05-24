import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutoridade {

	@Test
	void testTratamento() {
		Autoridade a1 = new Autoridade("João", "Roma", "Masculino", "Príncipe de Si Mesmo");
		Autoridade a2 = new Autoridade("Maria", "Roma", "Feminino", "Digníssima");
		
		assertEquals(a1.getTratamento("Informal"), "João");
		assertEquals(a1.getTratamento("Respeitoso"), "Sr. Roma");
		assertEquals(a1.getTratamento("ComTítulo"), "Príncipe de Si Mesmo João Roma");
		
		assertEquals(a2.getTratamento("Informal"), "Maria");
		assertEquals(a2.getTratamento("Respeitoso"), "Sra. Roma");
		assertEquals(a2.getTratamento("ComTítulo"), "Digníssima Maria Roma");
	}

}
