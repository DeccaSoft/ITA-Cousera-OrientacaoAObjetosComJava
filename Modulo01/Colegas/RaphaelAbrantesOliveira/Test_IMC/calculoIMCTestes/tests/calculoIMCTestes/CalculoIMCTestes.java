package calculoIMCTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.br.calculoimc.Paciente;

public class CalculoIMCTestes {

	private Paciente p; 
	
	@Test
	public void baixoPesoMuitoGrave() {
		p = new Paciente(30.0, 1.40);
		assertTrue(p.calcularIMC() < 16);
	}
	
	@Test
	public void baixoPesoGrave() {
		p = new Paciente(30.0, 1.35);
		assertTrue(p.calcularIMC() >= 16 && p.calcularIMC() < 17);
	}
	
	@Test
	public void baixoPeso() {
		p = new Paciente(36.0, 1.40);
		assertTrue(p.calcularIMC() >= 17 && p.calcularIMC() < 18.5 );
	}

	@Test
	public void pesoNormal() {
		p = new Paciente(40.0, 1.35);
		assertTrue(p.calcularIMC() >= 18.5 && p.calcularIMC() < 25);
	}
	
	@Test
	public void sobrepeso() {
		p = new Paciente(60.0, 1.45);
		assertTrue(p.calcularIMC() >= 25 && p.calcularIMC() < 30);
	}
	
	@Test
	public void obesidadeGrauUm() {
		p = new Paciente(70.0, 1.45);
		assertTrue(p.calcularIMC() >= 30 && p.calcularIMC() < 35);
	}
	
	@Test
	public void obesidadeGrauDois() {
		p = new Paciente(80.0, 1.45);
		assertTrue(p.calcularIMC() >= 35 && p.calcularIMC() < 40);
	}
	
	@Test
	public void obesidadeGrauTres() {
		p = new Paciente(100.0, 1.55);
		assertTrue(p.calcularIMC() > 40);
	}
}
