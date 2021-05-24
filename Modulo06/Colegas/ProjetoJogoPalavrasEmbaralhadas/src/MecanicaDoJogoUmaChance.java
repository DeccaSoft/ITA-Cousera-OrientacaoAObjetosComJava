//Alexandre Luís Nunes Cardiga
import java.io.IOException;

public class  MecanicaDoJogoUmaChance implements MecanicaDoJogo {
    private int vida, pontos;
	private FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();	
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
	private String palavraEscolhidaAleatoria = bancoDePalavras.getPalavraAleatoria();
	private String PalavraEscolhidaEmbaralhada = fabricaEmbaralhadores.getEmbaralhadorAleatorio().embaralhar(palavraEscolhidaAleatoria);
	public MecanicaDoJogoUmaChance() throws IOException {
		}	

	public int getPontos(){
		return this.pontos;
	}	

	public void acerta(int n){
		this.pontos += n*4;
	}	
	
	@Override
	public boolean jogoTerminou (int tentativas)
	{
		if (tentativas == 1 )
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


