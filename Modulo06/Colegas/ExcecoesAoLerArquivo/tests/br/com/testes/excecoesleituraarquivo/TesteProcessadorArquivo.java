/**
 * 
 */
package br.com.testes.excecoesleituraarquivo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import br.com.excecoesleituraarquivo.LeituraArquivoException;
import br.com.excecoesleituraarquivo.ProcessadorDeArquivo;

/**
 * @author Raphael
 *
 */
public class TesteProcessadorArquivo {

	@Test
	public void testeProcessar() {
		new ProcessadorDeArquivo();
		HashMap<String, String> hm = ProcessadorDeArquivo.processar("texto.txt");
		new ProcessadorDeArquivo();
		assertEquals(hm, ProcessadorDeArquivo.processar("texto.txt"));
	}

	@Test(expected = LeituraArquivoException.class)
	public void testeArquivoVazio() {
		try {
			new ProcessadorDeArquivo();
			ProcessadorDeArquivo.processar("vazio.txt");
		} catch (RuntimeException e) {
			String msg = "Arquivo vazio.";
			assertEquals(msg, e.getMessage());
			throw new LeituraArquivoException();
		}
	}

	@Test(expected = LeituraArquivoException.class)
	public void testeArquivoErrado() {
		try {
			new ProcessadorDeArquivo();
			ProcessadorDeArquivo.processar("errado.txt");
		} catch (RuntimeException e) {
			String msg = "Formato de arquivo inválido.";
			assertEquals(msg, e.getMessage());
			throw new LeituraArquivoException();
		}
	}
}
