/*
 * author André Morais de Azevedo
 * @date 22/08/2020 20:25
 */
public class ComTitulo implements FormatadorNome {

	//private String titulo;
	
	private String sexo;
	private String tratamento;
	private String nome;
	private String sobrenome;
	
	
	
	public ComTitulo(String sexo, String tratamento, String nome, String sobrenome) {
		super();
		this.sexo = sexo;
		this.tratamento = tratamento;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public ComTitulo(String titulo) {
		this.tratamento = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return tratamento + " " + nome + " " + sobrenome;
	}
}
