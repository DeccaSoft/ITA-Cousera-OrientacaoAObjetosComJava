import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import java.util.HashMap;

public class ProcessadorArquivoTest {
	
	@Test(expected = LeituraArquivoException.class)
	public void testArquivoNaoEncontrado() 
			throws LeituraArquivoException, IOException {
		try {
			ProcessadorArquivo.processar("dadoss.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Erro ao abrir o arquivo"));
			throw e;
		}
	}
	
	@Test(expected = LeituraArquivoException.class)
	public void testArquivoVazio() 
			throws LeituraArquivoException, IOException {
		try {
			ProcessadorArquivo.processar("arquivo-vazio.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Arquivo vazio"));
			throw e;
		}
				
	}
	
	@Test(expected = LeituraArquivoException.class)
	public void testFormatoInvalido() 
			throws LeituraArquivoException, IOException {
		try {
			ProcessadorArquivo.processar("arquivo-formato-invalido.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Formato de arquivo inválido"));
			throw e;
		}
				
	}
	
	@Test
	public void testArquivoLidoComSucesso() 
			throws LeituraArquivoException, IOException {
		HashMap<String,String> resposta = new HashMap<String,String>();

		resposta.put("nome", "Eduardo");
		resposta.put("sobrenome", "Guerra");
		resposta.put("idade", "35");
		
		HashMap<String,String> retorno = ProcessadorArquivo.processar("dados.txt");
		
		assertEquals(resposta,retorno);
		
	}

}
