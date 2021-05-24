package br.com.mario.embaralhador;

import org.junit.Assert;
import org.junit.Test;

public class EmbaralhadorDoisTest {

    @Test
    public void embaralharDoisTest() {
        EmbaralhadorDois embaralhador = new EmbaralhadorDois();
        String resultado = embaralhador.embaralhar("abcde");
        Assert.assertEquals("bdeca", resultado);
    }
}