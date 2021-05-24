/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 17:38
 */
package embaralhador;

public class Inverte implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavra) {
        StringBuilder sb = new StringBuilder();
        for(int i = palavra.length(); i > 0; i--){
            sb.append(palavra.charAt(i-1));
        }
        return sb.toString();
	}

}
