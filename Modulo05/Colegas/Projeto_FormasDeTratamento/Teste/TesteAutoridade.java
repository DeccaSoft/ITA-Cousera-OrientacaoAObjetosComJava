//Alexandre Luís Nunes Cardiga

import static org.junit.Assert.*;
import org.junit.Test;
public class TesteAutoridade {
	
	@Test
	public void testeInformal()
	{
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade ("João", "Garcia", fn);
		assertEquals("João",a.getTratamento());
		
	}
	
	@Test
	public void testeRespeitosoMasculino ()
	{
		FormatadorNome fn = new Respeitoso(true, false);
		Autoridade a = new Autoridade ("João", "Garcia", fn);	
		assertEquals("Sr. João Garcia",a.getTratamento());
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
		Autoridade a = new Autoridade ("João", "Garcia", fn);			
		assertEquals("Dr. João Garcia",a.getTratamento());
	}

}
