package com.coursera.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coursera.interfaces.Autoridade;
import com.coursera.interfaces.ComTitulo;
import com.coursera.interfaces.FormatadorNome;
import com.coursera.interfaces.Informal;
import com.coursera.interfaces.Respeitoso;

public class AutoridadeTest {

	@Test
	public void testInformal() {
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade("Hiago", "Forte", fn);
		assertEquals(a.getTratamento(), "Hiago");
	}

	@Test
	public void testRespeitosoMasculino() {
		FormatadorNome fn = new Respeitoso(true, false);
		Autoridade a = new Autoridade("Hiago", "Forte", fn);
		assertEquals(a.getTratamento(), "Sr. Hiago Forte");
	}

	@Test
	public void testRespeitosoFeminino() {
		FormatadorNome fn = new Respeitoso(false, true);
		Autoridade a = new Autoridade("Paula", "Forte", fn);
		assertEquals(a.getTratamento(), "Sra. Paula Forte");
	}

	@Test
	public void testTitulo() {
		FormatadorNome fn = new ComTitulo("Mister");
		Autoridade a = new Autoridade("Hiago", "Forte", fn);
		assertEquals(a.getTratamento(), "Mister Hiago Forte");
	}

}
