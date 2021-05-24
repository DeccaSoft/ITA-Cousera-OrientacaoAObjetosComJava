//Alexandre Lu�s Nunes Cardiga

import static org.junit.Assert.*;
import org.junit.Test;
public class TesteAutoridade {
	
	@Test
	public void testeInformal()
	{
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade ("Jo�o", "Garcia", fn);
		assertEquals("Jo�o",a.getTratamento());
		
	}
	
	@Test
	public void testeRespeitosoMasculino ()
	{
		FormatadorNome fn = new Respeitoso(true, false);
		Autoridade a = new Autoridade ("Jo�o", "Garcia", fn);	
		assertEquals("Sr. Jo�o Garcia",a.getTratamento());
	}
	
	@Test
	public void testeRespeitosoFeminino ()
	{
		FormatadorNome fn = new Respeitoso(false, true);
		Autoridade a = new Autoridade ("Joana", "Silva", fn);	
		assertEquals("Sra. Joana Silva",a.getTratamento());
	}
	
	@Test
	public void testeComTitulo ()
	{
		FormatadorNome fn = new ComTitulo("Dr.");
		Autoridade a = new Autoridade ("Jo�o", "Garcia", fn);			
		assertEquals("Dr. Jo�o Garcia",a.getTratamento());
	}

}
