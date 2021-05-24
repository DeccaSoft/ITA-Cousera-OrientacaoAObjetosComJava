package testes;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import principal.BancoDePalavras;
import principal.LeitoraDeArquivo;

class TesteBancoDePalavras {

	@Test
    public void testeLeituraDeDados() {
        List<String> lista = new ArrayList<String>();
        LeitoraDeArquivo palavras = new LeitoraDeArquivo();
        try {
        	lista = palavras.getPalavraArquivo();
        } catch (IOException e) {
            
        }
        assertEquals("CLASSE", lista.get(0));
    }
	
	@Test
    public void testeGetTamanho() {
		BancoDePalavras palavras = new BancoDePalavras();
        palavras.getNext();
        assertEquals(20, palavras.getTamanho());
    }

}
