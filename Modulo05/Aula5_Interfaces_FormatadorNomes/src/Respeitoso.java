/*
 * author André Morais de Azevedo
 * @date 22/08/2020 20:25
 */
public class Respeitoso implements FormatadorNome {

	//private String sexo;
	
	private String sexo;
	private String tratamento;
	private String nome;
	private String sobrenome;
	
	
	
	public Respeitoso(String sexo, String tratamento, String nome, String sobrenome) {
		super();
		this.sexo = sexo;
		this.tratamento = tratamento;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Respeitoso(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(this.sexo.equals("M") || this.sexo.equals("m")) {
			return "Sr. "+ nome + " " + sobrenome;
		}else if(this.sexo.equals("F") || this.sexo.equals("f")) {
			return "Sra. "+ nome + " " + sobrenome;
		}else {
			return "Sexo Inválido!!!";
		}
	}
}
