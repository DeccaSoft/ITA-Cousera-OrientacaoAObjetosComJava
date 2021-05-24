//Alexandre Luís Nunes Cardiga
import java.util.Random;

public class FabricaEmbaralhadores {
	public Embaralhador getEmbaralhadorAleatorio()
	{
		Random r = new Random();
		int selecao = r.nextInt(3);

		switch(selecao) {
		  case 0:
			return new EmbaralhadorAleatorio();
		  case 1:			
			return new EmbaralhadorOrdenado();
	      case 2:			
			 return new EmbaralhadorReverso();
		  default:			
			return new EmbaralhadorAleatorio(); 

		}		
	}
}

