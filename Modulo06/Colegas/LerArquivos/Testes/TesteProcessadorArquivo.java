import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TesteProcessadorArquivo {

	@Test
	public void testProcessar() {
		Map<String, String> teste = ProcessadorArquivo.processar("arquivo.txt");
		assertEquals("Eduardo", teste.get("nome"));
		assertEquals("Guerra", teste.get("sobrenome"));
		assertEquals("35", teste.get("idade"));
    }
	
	@Test(expected = LeituraArquivoException.class)
	public void testLeituraArquivo() {
		Map<String, String> teste = ProcessadorArquivo.processar("arquivo1.txt");
	}
	
	@Test(expected = ArquivoVazioException.class)
	public void testArquivoVazio() {
		Map<String, String> teste = ProcessadorArquivo.processar("arquivoVazio.txt");
	}
	
	@Test(expected = FormatoArquivoException.class)
	public void testFormatoArquivoInvalido() {
		Map<String, String> teste = ProcessadorArquivo.processar("arquivoFormatoInvalido.txt");
	}

}
