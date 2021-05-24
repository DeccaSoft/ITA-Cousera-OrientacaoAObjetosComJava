package testesEmbaralhamentos;

import static org.junit.Assert.*;

import org.junit.Test;

import jogo.EmbaralhadorDois;
import jogo.EmbaralhadorUm;

public class EmbaralhamentoTest {

	@Test
	public void testeEmbaralhadorUm() {

		EmbaralhadorUm e = new EmbaralhadorUm();
		String s = "teste";
		assertNotEquals(e.embaralhar(s), s);
	}

	@Test
	public void testeEmbaralhadorDois() {

		EmbaralhadorDois e = new EmbaralhadorDois();
		String s = "teste";
		assertEquals(e.embaralhar(s), "etset");
	}

}
