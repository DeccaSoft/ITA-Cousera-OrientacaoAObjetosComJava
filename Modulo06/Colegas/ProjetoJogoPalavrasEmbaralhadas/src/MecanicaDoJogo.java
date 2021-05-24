//Alexandre Luís Nunes Cardiga
import java.io.IOException;

public interface MecanicaDoJogo {
	public boolean testaPalavra(String tentativa) throws IOException;
	public String getPalavraEscolhidaAleatoria() throws IOException;
	public String getPalavraEscolhidaEmbaralhada() throws IOException;
	public boolean jogoTerminou (int tentativas);
	
	abstract int getPontos();
	abstract void acerta(int n);
	
}

