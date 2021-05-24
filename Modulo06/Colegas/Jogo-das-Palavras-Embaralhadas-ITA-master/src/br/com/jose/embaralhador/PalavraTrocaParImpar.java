package br.com.jose.embaralhador;

public class PalavraTrocaParImpar implements Embaralhador{

    @Override
    public String embaralhar(String palavra) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < palavra.length(); i++){
            if(i % 2 != 0){
                builder.append(palavra.charAt(i));
                builder.append(palavra.charAt(i-1));
            }else if(i == palavra.length()){
                builder.append(palavra.charAt(i));
            }
        }
        return builder.toString();
    }
    
}
