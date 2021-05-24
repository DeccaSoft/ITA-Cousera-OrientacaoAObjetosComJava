/*
 * author André Morais de Azevedo
 * @date 22/08/2020 20:25
 */
public abstract class Autoridade implements FormatadorNome{
	
	private String sexo;
	private String tratamento;
	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;
	
	

	public Autoridade(String sexo, String tratamento, String nome, String sobrenome) {
		this.sexo = sexo;
		this.tratamento = tratamento;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
		
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(tratamento.equals("Informal")) {
			formatador = new Informal();
			return formatador.formatarNome(nome, sobrenome);
		}else if(tratamento.equals("Respeitoso")) {
			formatador = new Respeitoso(sexo);
			return formatador.formatarNome(nome, sobrenome);
		}else if(tratamento.equals("ComTitulo")) {
			formatador = new ComTitulo(tratamento);
			return formatador.formatarNome(nome, sobrenome);
		}else {
			return "Título Inválido!!!";
		}
	}
	
	protected void getTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
}
