import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

/*
 * @Author: André Morais de Azevedo
 * @DateTime: 31/08/20 14:55
 */

public class TesteArquivos {

	@Test
	public void testeArquivoCorreto() throws LeituraArquivoException, IOException {
		new ProcessadorDeArquivo();
		HashMap<String, String> mapa = ProcessadorDeArquivo.processar("ArquivoCorreto.txt");
		//new ProcessadorDeArquivo();
		assertEquals(mapa, ProcessadorDeArquivo.processar("ArquivoCorreto.txt"));
	}

	@Test(expected = LeituraArquivoException.class)
	public void testeArquivoVazio() throws LeituraArquivoException, IOException {
		try {
			new ProcessadorDeArquivo();
			ProcessadorDeArquivo.processar("ArquivoVazio.txt");
		} catch (RuntimeException exc) {
			String msg = "Empty File!!!";
			assertEquals(msg, exc.getMessage());
			throw new LeituraArquivoException(msg);
		}
	}

	@Test(expected = LeituraArquivoException.class)
	public void testeArquivoErrado() throws LeituraArquivoException, IOException {
		try {
			new ProcessadorDeArquivo();
			ProcessadorDeArquivo.processar("ArquivoInvalido.txt");
		} catch (RuntimeException exc) {
			String msg = "Invalid Fila!!!";
			assertEquals(msg, exc.getMessage());
			throw new LeituraArquivoException(msg);
		}
	}

}
