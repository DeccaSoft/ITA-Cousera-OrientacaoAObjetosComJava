/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 16:42
 */
package mecanicas;

import principal.BancoDePalavras;

public class NivelMedio implements MecanicaDoJogo{

    private BancoDePalavras palavras = new BancoDePalavras();
	private int tentativas = 5;
    private int pontos = 0;
    
    @Override
    public String getNivel() {
        return "Médio";
    }

    @Override
    public String getRegras() {
    	return "No Dicionário temos 20 Palavaras sobre o tema 'Java e Orietação a Objetos' \n"
        		+ "que serão embaralhadas de duas maneiras aleatórias, \n"
        		+ "uma é trocando as posições das letras e a outra, tente adivinhar. \n"
        		+ "Neste nível, você terá limite de 5 Tentativas \n"
        		+ "e a cada palavra acertada, você ganhara 1 de pontos \n"
        		+ "no entanto, a cada palavra errada, você NÃO perderá pontos. \n"
        		+ "ATENÇÃO: Não utilize acentos, nem '�' e nem caracteres especias como '-' \n"
        		+ "Boa Sorte!!! \n";
    }

    @Override
    public String getPalavra() {
        return palavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            pontos++;
            return "Parabéns, Você acertou e Ganhou 1 Ponto!!! Você ainda pode errar " + tentativas + " vezes.";
        }else{
            tentativas--;
            return "Aaahhh... Você Errou!!! Mas NãO Desanime. Tente Novamente, pois você ainda pode errar " + tentativas + " vezes.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
    	if(pontos == 0) {
    		return "Infelizmente, não foi dessa vez... Sua pontuação foi: " + pontos + " Ponto(s)!!!";
        }else {
        	return "Parabéns!!! Sua pontuação foi: " + pontos + " Ponto(s)!";
        }
    }
    
    @Override
    public boolean isOver() {
        if(tentativas <= 0){
            return true;
        }else {
            return false;
        }
    }
}
