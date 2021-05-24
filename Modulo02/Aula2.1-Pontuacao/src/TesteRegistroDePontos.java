import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroDePontos {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "André";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroDePontos rp = new RegistroDePontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 5);
	}
	
	@Test
	void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "André";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroDePontos rp = new RegistroDePontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 25);
	}
	
	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "André";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroDePontos rp = new RegistroDePontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 15);
	}
	
	@Test
	void pontosCriarTopicoVIPBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "André";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroDePontos rp = new RegistroDePontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 50);
	}

}
