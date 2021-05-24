/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 16:44
 */
package mecanicas;

import principal.BancoDePalavras;

public class NivelDificil implements MecanicaDoJogo{

    private BancoDePalavras palavras = new BancoDePalavras();
    private int qtdAcertos = 0;
	private boolean isErrou = false;
    
    @Override
    public String getNivel() {
        return "Difícil";
    }

    @Override
    public String getRegras() {
    	return "No Dicionário temos 20 Palavaras sobre o tema Java e Orietação a Objetos \n"
        		+ "que serão embaralhadas de duas maneiras aleatórias, \n"
        		+ "tente descobrir quais são elas... Isso pode ser crucial para você vencer. \n"
        		+ "Neste nível, você não terá limite de tentativas \n"
        		+ "e a cada palavra acertada, você poderá tentar adivinhar a próxima \n"
        		+ "no entanto, se errar UMA palavra, você perderá o Jogo. \n"
        		+ "ATENçãO: Não utilize acentos, nem '�' e nem caracteres especias como '-' \n"
        		+ "Aqui é Tudo ou Nada!!! Boa Sorte!!! \n";
    }

    @Override
    public String getPalavra() {
        return palavras.getNext();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            qtdAcertos++;
            return "Parabéns, Você acertou esta Palavra!!! Tente a Próxima...";
        }else{
            isErrou = true;
            return "Aaahhh... Você Errou!!! Mas NãO Desanime... Tente Novamente!!!";
        }
    }

    @Override
    public String getResultadoFinal() {
    	if (qtdAcertos == 0) {
    		return "Infelizmente, não foi dessa vez... Você não Acertou NENHUMA palavra!!!";
    	}else {
            return "Parabéns... Você Acertou " + qtdAcertos + " das 20 Palavras do Dicionário.";
    	}

    }
    
    @Override
    public boolean isOver() {
        return isErrou;
    }

}
