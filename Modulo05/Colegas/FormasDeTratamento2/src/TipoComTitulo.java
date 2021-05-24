
public class TipoComTitulo implements FormatadorNome {

	private String titulo; 
	
	public TipoComTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo+" "+nome+" "+sobrenome;
	}

}
