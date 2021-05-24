/*
 * author André Morais de Azevedo
 * @date 22/08/2020 20:25
 */
public class Informal implements FormatadorNome {

	private String sexo;
	private String tratamento;
	private String nome;
	private String sobrenome;
	
	
	
	public Informal(String sexo, String tratamento, String nome, String sobrenome) {
		super();
		this.sexo = sexo;
		this.tratamento = tratamento;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Informal() {
		
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome + " " + sobrenome;
	}
	
	
}
