
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("Andre") && senha.equals("SenhaDoAndre")) {
			return new Usuario(login);
		}
		throw new LoginException("Usuário e Senha não batem!", login);
	}
}
