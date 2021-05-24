
public class Autoridade implements FormatadorNome {

	private String nome;
	private String sobrenome;
	private String sexo;
	private String titulo;
	private String tipoTratamento;
	
	public Autoridade(String nome, String sobrenome, String sexo, String titulo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getSexo() {
		return sexo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTratamento(String tipoTratamento) {
		this.tipoTratamento = tipoTratamento;
		return formatarNome(nome, sobrenome);
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (tipoTratamento == "Informal") {
			return this.getNome();
		}
		else if (tipoTratamento == "Respeitoso") {
			if (this.getSexo() == "Masculino") {
				return "Sr. " + this.getSobrenome();
			}
			else if (this.getSexo() == "Feminino") {
				return "Sra. " + this.getSobrenome();
			}
		}
		else if (tipoTratamento == "ComTítulo") {
			return this.getTitulo()+" "+this.getNome()+" "+this.getSobrenome();
		}
	
		return "Erro";

	}

	
}
