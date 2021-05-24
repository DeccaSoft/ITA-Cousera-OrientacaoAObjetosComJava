package calculaIMC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteIMC {

	
	@Test
	public void testVerificaCalcuIMC() { 
		Paciente teste = new Paciente(57, 1.75);
		
		teste.calcularIMC(); 
		double valorEsperado = 18.61; 
		assertEquals(valorEsperado, teste.calcularIMC(),0.01); 
	}
		
	@Test
	public void testPBaixoPesoMuitoGrave() { 
		Paciente p1 = new Paciente(40, 1.60);
		
		p1.diagnostico(); 
		String valorEsperado= "Baixo peso muito grave"; 
		assertEquals(valorEsperado, p1.diagnostico()); 
	}
	
	@Test
	public void testPBaixoPesoGrave() { 
		Paciente p2 = new Paciente(40, 1.55);
		
		p2.diagnostico(); 
		String valorEsperado= "Baixo peso grave"; 
		assertEquals(valorEsperado, p2.diagnostico()); 
	}
			
	@Test
	public void testPBaixoPeso() { 
		Paciente p3 = new Paciente(45, 1.60);
		
		p3.diagnostico(); 
		String valorEsperado= "Baixo peso"; 
		assertEquals(valorEsperado, p3.diagnostico()); 
	}
	@Test
	public void testPesoNormal() { 
		Paciente p4 = new Paciente(70, 1.75);
		
		p4.diagnostico(); 
		String valorEsperado= "Peso normal"; 
		assertEquals(valorEsperado, p4.diagnostico()); 
	}
	@Test
	public void testPSobrepeso() { 
		Paciente p5 = new Paciente(75, 1.61);
		
		p5.diagnostico(); 
		String valorEsperado= "Sobrepeso"; 
		assertEquals(valorEsperado, p5.diagnostico()); 
	}
		  
	@Test
	public void testPObesidadeGrauI() { 
		Paciente p6 = new Paciente(120, 1.90);
		
		p6.diagnostico(); 
		String valorEsperado= "Obesidade grau I"; 
		assertEquals(valorEsperado, p6.diagnostico()); 
	}

	@Test
	public void testPObesidadeGrauII() { 
		Paciente p7 = new Paciente(120, 1.85);
		
		p7.diagnostico(); 
		String valorEsperado= "Obesidade grau II"; 
		assertEquals(valorEsperado, p7.diagnostico()); 
	}
	@Test
	public void testPObesidadeGrauIII() { 
		Paciente p8 = new Paciente(120, 1.61);
		
		p8.diagnostico(); 
		String valorEsperado= "Obesidade grau III"; 
		assertEquals(valorEsperado, p8.diagnostico()); 
	}
	
	}


