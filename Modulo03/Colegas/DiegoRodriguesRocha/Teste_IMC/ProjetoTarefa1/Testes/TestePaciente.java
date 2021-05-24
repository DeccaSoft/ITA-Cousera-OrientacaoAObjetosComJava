import static org.junit.Assert.*;
import org.junit.Test;

public class TestePaciente {
	
	@Test
	public void testCalcularIMC() {
		Paciente paciente = new Paciente(85, 1.78);
		
		double imc = paciente.calcularIMC();
		
		assertEquals(26.83, imc, 0.01);
		
		paciente = new Paciente(65, 1.68);
		
		imc = paciente.calcularIMC();
		
		assertEquals(23.03, imc, 0.01);
		
		paciente = new Paciente(17, 1.10);
		
		imc = paciente.calcularIMC();
		
		assertEquals(14.05, imc, 0.01);
	}
	
	@Test
	public void testDiagnostico() {
		Paciente paciente = new Paciente(17, 1.10);
		
		assertEquals("Baixo peso muito grave = IMC abaixo de 16 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(40, 1.58);
		
		assertEquals("Baixo peso grave = IMC entre 16 e 16,99 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(45, 1.58);
		
		assertEquals("Baixo peso = IMC entre 17 e 18,49 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(65, 1.65);
		
		assertEquals("Peso normal = IMC entre 18,50 e 24,99 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(85, 1.78);
		
		assertEquals("Sobrepeso = IMC entre 25 e 29,99 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(100, 1.78);
		
		assertEquals("Obesidade grau I = IMC entre 30 e 34,99 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(115, 1.78);
		
		assertEquals("Obesidade grau II = IMC entre 35 e 39,99 kg/m²", paciente.diagnostico());
		
		paciente = new Paciente(130, 1.78);
		
		assertEquals("Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²", paciente.diagnostico());
	}
}
