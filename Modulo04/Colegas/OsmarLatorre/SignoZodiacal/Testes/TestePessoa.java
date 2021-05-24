import static org.junit.Assert.*;

import org.junit.Test;

public class TestePessoa {

	@Test
	public void testIdade() {
		Pessoa pessoa = new Pessoa("12/05/1980");
		assertEquals(40, pessoa.getIdade());
	}

	@Test
	public void testSigno() {
		Pessoa pessoa = new Pessoa("12/05/1980");
		String expected = "Touro";
		assertEquals(0, expected.compareTo(pessoa.getSigno()));
	}
	
	@Test
	public void testOutroSigno() {
		Pessoa pessoa = new Pessoa("28/02/2012");
		String expected = "Peixes";
		assertEquals(expected, pessoa.getSigno());
	}
}
