//Alexandre Luís Nunes Cardiga
public class EmbaralhadorReverso implements Embaralhador {
	//embaralhar reversamente
	
	@Override
	public String embaralhar(String c) {  
		String s = "";
		
		for(int i = c.length() - 1; i >= 0; i--)
		   {
			s += c.charAt(i);
		   }
		return s;

                                      }
}