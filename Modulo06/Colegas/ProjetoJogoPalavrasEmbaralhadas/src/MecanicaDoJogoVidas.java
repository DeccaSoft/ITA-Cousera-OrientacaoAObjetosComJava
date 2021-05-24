//Alexandre Luís Nunes Cardiga
import java.io.IOException;

public class MecanicaDoJogoVidas implements MecanicaDoJogo {
	private int  pontos;
	private FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();	
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
	private String palavraEscolhidaAleatoria = bancoDePalavras.getPalavraAleatoria();
	private String PalavraEscolhidaEmbaralhada = fabricaEmbaralhadores.getEmbaralhadorAleatorio().embaralhar(palavraEscolhidaAleatoria);
	public MecanicaDoJogoVidas () throws IOException {
		}	
	
	
	public int getPontos(){
		return this.pontos;
	}	
		
	public void acerta(int n){
		this.pontos += n*2;
	}	
	
	@Override
	public boolean jogoTerminou (int tentativas)
	{
		if (tentativas == 5 )
		{
			return true;
		} else return false;		
		
	}
	
	@Override
	public boolean testaPalavra(String tentativa) throws IOException
		{
			if (tentativa.equals(getPalavraEscolhidaAleatoria()))
			   {
				return true;
			   }
			else 
			  	{
				  return false;
				}
		}
	
	@Override
	public String getPalavraEscolhidaAleatoria() throws IOException
	{
		return palavraEscolhidaAleatoria;
	}
	@Override
	public String getPalavraEscolhidaEmbaralhada() throws IOException
	{
		return PalavraEscolhidaEmbaralhada;
	}
	
 
}

