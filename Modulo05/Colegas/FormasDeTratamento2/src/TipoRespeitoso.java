
public class TipoRespeitoso implements FormatadorNome {


	private boolean sr; 
	private boolean sra; 
	
	public TipoRespeitoso(boolean sr, boolean sra) {
		this.sr = sr; 
		this.sra = sra; 
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sr) {
			return "Sr."+sobrenome;
		}
		if (sra) {
			return "Sra."+sobrenome; 
		}
		return null;
	}

}
