package br.com.jose.test.embaralhadores;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.jose.embaralhador.PalavraInversa;
import br.com.jose.embaralhador.PalavraTrocaParImpar;

public class TestEmbaralhador {

	 @Test
	    public void tesInversor() {
	        PalavraInversa palavras = new PalavraInversa();
	        String resultado = palavras.embaralhar("Jose");
	        assertEquals("esoJ", resultado);
	    }
	    
	    @Test
	    public void tesTrocaParImpar() {
	        PalavraTrocaParImpar palavras = new PalavraTrocaParImpar();
	        String resultado = palavras.embaralhar("Jose");
	        assertEquals("oJes", resultado);
	    }

}
