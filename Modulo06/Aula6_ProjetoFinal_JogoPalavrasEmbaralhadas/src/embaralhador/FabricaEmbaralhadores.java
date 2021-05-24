/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 17:33
 */
package embaralhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores{
	
	private static List<Embaralhador> embaralhadores = new ArrayList<>();
    
    static{
    	embaralhadores.add(new Inverte());
        embaralhadores.add(new TrocaLetras());
    }
    
    //Sorteia o tipo de Embaralhador [Inverte() ou TrocaLetras()]
    public static Embaralhador getRandom(){
    	Random randomico = new Random();
    	int tipoEmbaralhador = randomico.nextInt(2);
    	return embaralhadores.get(tipoEmbaralhador);
    }
}
