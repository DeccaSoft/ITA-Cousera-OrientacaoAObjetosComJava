import static org.junit.Assert.*;

import org.junit.Test;

public class FormasDeTratamentoTeste {

	@Test
	public void testTipoInformal() {
		FormatadorNome formatadorNome= new TipoInformal(); 
		Autoridade a1 = new Autoridade ("Maria", "Silva", formatadorNome); 
		assertEquals(a1.getTratamento(), "Maria"); 
	}
	
	@Test
	public void testTipoRespeitosoSr() {
		FormatadorNome formatadorNome= new TipoRespeitoso(true,false);// true q � sr e false q � sra;  
		Autoridade a2 = new Autoridade ("Jos�", "Silva", formatadorNome); 
		assertEquals(a2.getTratamento(), "Sr.Silva"); 
	}
	@Test
	public void testTipoRespeitosoSra() {
		FormatadorNome formatadorNome= new TipoRespeitoso(false,true);
		Autoridade a3 = new Autoridade ("Maria", "Silva", formatadorNome); 
		assertEquals(a3.getTratamento(), "Sra.Silva"); 
	}
	@Test
	public void testTipoComTitulo() {
		FormatadorNome formatadorNome= new TipoComTitulo("Vossa Excel�ncia");
		Autoridade a4 = new Autoridade ("Carmem", "L�cia", formatadorNome); 
		assertEquals(a4.getTratamento(), "Vossa Excel�ncia Carmem L�cia"); 
	}
	

}
