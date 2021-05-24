package br.com.mario.embaralhador;

import org.junit.Assert;
import org.junit.Test;

public class EmbaralhadorUmTest {

    @Test
    public void embaralharUmTest() {
        EmbaralhadorUm embaralhador = new EmbaralhadorUm();
        String resultado = embaralhador.embaralhar("abcde");
        Assert.assertEquals("edcba", resultado);
    }
}