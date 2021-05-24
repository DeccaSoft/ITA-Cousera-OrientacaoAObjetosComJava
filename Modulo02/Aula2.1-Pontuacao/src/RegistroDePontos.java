
public class RegistroDePontos {
	
	private CalculadoraBonus bonus;
	
	public RegistroDePontos(CalculadoraBonus cb) {
		bonus = cb;
	}
	
	public void fazerComentario(Usuario u) {

		u.pontos += 3 * bonus.bonus(u);
	}
	
	public void criarTopico(Usuario u) {
		u.pontos += 5 * bonus.bonus(u);
	}
	
	public void darLike(Usuario u) {
		u.pontos +=1 * bonus.bonus(u);
	}
}
