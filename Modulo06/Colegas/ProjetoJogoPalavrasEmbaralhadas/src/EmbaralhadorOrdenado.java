//Alexandre Luís Nunes Cardiga

import java.util.Arrays;

public class EmbaralhadorOrdenado implements Embaralhador {
	public String embaralhar(String c){ 
	
		char[] array = c.toCharArray();
		Arrays.sort(array);
		return new String(array);
	
	}
}
