import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	public void testLoginSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Andre", "SenhaDoAndre");
		assertEquals("Andre", u.getLogin());
	}

	@Test //(expected = LoginException.class) //Espera-se que LoginException seja lançada //Mas NÃO funciona no JUnit5
	public void testLoginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Andre", "SenhaErrada");
		//TODO Pesquisar como utilizar o expected no JUnit5
	}
	
	@Test //(expected = LoginException.class) //Espera-se que LoginException seja lançada //Mas NÃO funciona no JUnit5
	public void testInformacaoErro(){
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("Andre", "SenhaErrada");
			fail();
		} catch (LoginException e) {
			assertEquals("Andre", e.getLogin());
		}
	}
}
