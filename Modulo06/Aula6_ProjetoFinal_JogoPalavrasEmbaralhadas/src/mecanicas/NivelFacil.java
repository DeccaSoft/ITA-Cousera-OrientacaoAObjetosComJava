/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 16:40
 */
package mecanicas;

import principal.BancoDePalavras;

public class NivelFacil implements MecanicaDoJogo{

	private BancoDePalavras palavras = new BancoDePalavras();
	private static int quantidadeDePalavras = 0;
    private String palavraAtual = palavras.getNext();
    private int palavrasRestantes = palavras.getTamanho();
    private int pontos = 0;
    
    
    @Override
    public String getNivel() {
        return "Fácil";
    }

    @Override
    public String getRegras() {
        return "No Dicionário temos 20 Palavaras sobre o tema Java e Orietação a Objetos \n"
        		+ "que serão embaralhadas de duas maneiras aleatórias, \n"
        		+ "uma é invertendo-se as letras e a outra é as trocando de posição. \n"
        		+ "Neste nível, você terá limite de 20 tentativas \n"
        		+ "e a cada palavra acertada, você ganhara 2 de pontos \n"
        		+ "no entanto, a cada palavra errada, você perderá 1 ponto. \n"
        		+ "ATENÇÃO: Não utilize acentos, nem '�' e nem caracteres especias como '-' \n"
        		+ "Boa Sorte!!! \n";
    }

    @Override
    public String getPalavra() {
        return palavraAtual;
    }
    
    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            pontos += 2;
            quantidadeDePalavras++;
            palavraAtual = palavras.getNext();
            return "Parabéns, Você acertou e Ganhou 2 Pontos!!! Ainda falta(m) " + (palavrasRestantes -quantidadeDePalavras) + " Tentativa(s).";
        }else{
            pontos -= 1;
            quantidadeDePalavras++;
            return "Aaahhh... Você Errou e Perdeu 1 Ponto!!! Mas NãO Desanime. Tente Novamente, pois ainda falta(m) " + (palavrasRestantes - quantidadeDePalavras) + " Tentativa(s).";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        if(pontos <= 0) {
        	return "Infelizmente, não foi dessa vez... Sua pontuação foi: " + pontos + " Pontos!!!";
        }else {
        	return "Parab�ns!!! Sua pontuação foi: " + pontos + " Ponto(s)!";
        }
    }
    
    @Override
    public boolean isOver() {
    	if(quantidadeDePalavras == palavras.getTamanho()) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
