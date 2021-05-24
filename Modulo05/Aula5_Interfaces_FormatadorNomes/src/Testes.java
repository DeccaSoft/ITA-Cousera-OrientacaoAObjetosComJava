import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * author Andr� Morais de Azevedo
 * @date 22/08/2020 20:25
 */
class Testes {


	@Test
	public void testeInformal() {
		Informal informal = new Informal("M", "Amigo", "André", "Morais");
		assertEquals("André Morais", informal.formatarNome("Andr�", "Morais"));
	}

	@Test
	public void testeRespeitoso() {
		Respeitoso respeitoso = new Respeitoso("m", "Padre", "André", "Morais");
		assertEquals("Sr. André Morais", respeitoso.formatarNome("Andr�", "Morais"));
	}
	
	@Test
	public void testeRespeitosa() {
		Respeitoso respeitoso = new Respeitoso("F", "Freira", "Daniela", "Morais");
		assertEquals("Sra. Daniela Morais", respeitoso.formatarNome("Daniela", "Morais"));
	}

	@Test
	public void testeComTitulo() {
		ComTitulo comTitulo = new ComTitulo("f", "Dra.", "Daniela", "Morais");
		assertEquals("Dra. Daniela Morais", comTitulo.formatarNome("Daniela", "Morais"));
	}

}
