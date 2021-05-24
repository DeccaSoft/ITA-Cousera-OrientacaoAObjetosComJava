package br.com.jose.test.bancopalavras;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.jose.dados.BancoDePalavras;
import br.com.jose.dados.LerDados;

public class TestBancoPalavra {

	@Test
    public void tesLerDados() {
        List<String> list = new ArrayList<String>();
        LerDados dados = new LerDados();
        try {
            list = dados.getPalavraArquivo();
        } catch (IOException ex) {
            
        }
        assertEquals("JUDO", list.get(1));
    }
	
	@Test
    public void testGetTamanho() {
		BancoDePalavras mPalavras = new BancoDePalavras();
        mPalavras.getNext();
        assertEquals(21, mPalavras.getTamanho());
    }

}
