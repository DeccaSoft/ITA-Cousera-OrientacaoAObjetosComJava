//Alexandre Luís Nunes Cardiga
import static org.junit.Assert.*;

import org.junit.Test;

public class TesteClassesEmbaralhamento {

	@Test
	public void testeEmbaralhadorOrdenado() {

		EmbaralhadorOrdenado emb = new EmbaralhadorOrdenado();
		String s = "testes";
		assertEquals(emb.embaralhar(s),"eesstt");
	}
	
	@Test
	public void testeEmbaralhadorReverso() {

		EmbaralhadorReverso emb = new EmbaralhadorReverso();
		String s = "testes";
		assertEquals(emb.embaralhar(s),"setset");
	}	
	
	@Test
	public void testeEmbaralhadorAleatorio() {

		EmbaralhadorAleatorio emb = new  EmbaralhadorAleatorio();
		String s = "testes";
		assertEquals(emb.embaralhar(s),"steest");
	}	
	
}
