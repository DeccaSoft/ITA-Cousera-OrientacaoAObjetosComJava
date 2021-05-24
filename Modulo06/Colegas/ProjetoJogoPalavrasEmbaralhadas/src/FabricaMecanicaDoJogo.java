//Alexandre Luís Nunes Cardiga
import java.io.IOException;

public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo getMecanicaDoJogoVidas () throws IOException
    {
       return new MecanicaDoJogoVidas();	
    }
    
    public static MecanicaDoJogo getMecanicaDoJogoUmaChance () throws IOException
    {
      return new MecanicaDoJogoUmaChance();
    }
    
 
}

