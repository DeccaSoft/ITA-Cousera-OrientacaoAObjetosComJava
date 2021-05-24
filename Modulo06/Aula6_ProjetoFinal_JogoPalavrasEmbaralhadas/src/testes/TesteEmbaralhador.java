package testes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import embaralhador.Inverte;
import embaralhador.TrocaLetras;

class TesteEmbaralhador {

	 @Test
	    public void testeInverte() {
	        Inverte palavra = new Inverte();
	        String palavraTeste = palavra.embaralhaPalavra("JAVA");
	        assertEquals("AVAJ", palavraTeste);
	    }
	    
	    @Test
	    public void teseTrocaLetras() {
	        TrocaLetras palavra = new TrocaLetras();
	        String palavraTeste = palavra.embaralhaPalavra("JAVA");
	        assertEquals("AJAV", palavraTeste);
	    }

}
