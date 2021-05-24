/*
 * @Author: André Morais de Azevedo
 * @DateTime: 30/08/2020 16:48
 */
package mecanicas;

public interface MecanicaDoJogo {

	public String getNivel();
    public String getRegras();
    public String getPalavra();
    public String tentativa(String palavra, String resposta);
    public String getResultadoFinal();
    public boolean isOver();
}
