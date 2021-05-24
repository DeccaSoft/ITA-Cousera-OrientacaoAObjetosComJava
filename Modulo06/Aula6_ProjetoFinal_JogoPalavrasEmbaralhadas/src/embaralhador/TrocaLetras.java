/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 17:39
 */
package embaralhador;

public class TrocaLetras implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavra) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < palavra.length(); i++){
            if(i % 2 != 0){
                sb.append(palavra.charAt(i));
                sb.append(palavra.charAt(i-1));
            }else if(i == palavra.length()){
                sb.append(palavra.charAt(i));
            }
        }
        return sb.toString();
	}

}
