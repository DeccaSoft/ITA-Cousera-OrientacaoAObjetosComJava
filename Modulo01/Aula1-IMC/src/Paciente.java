
public class Paciente {
	private double peso;
	private double altura;
	
	
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC() {
		return peso / (altura*altura);
	}
	
	public String diagnostico() {
		double imc = calcularIMC();
		String diagnostico=null;
		if(imc < 16) {
			diagnostico = "Baixo Peso - Muito Grave";
		}else if(imc >= 16 && imc < 17) {
			diagnostico = "Baixo Peso - Grave";
		}else if(imc >= 17 && imc < 18.5) {
			diagnostico = "Baixo Peso";
		}else if(imc >= 18.5 && imc < 25) {
			diagnostico = "Baixo - Normal";
		}else if(imc >= 25 && imc < 30) {
			diagnostico = "Sobrepeso";
		}else if(imc >= 30 && imc < 35) {
			diagnostico = "Obesidade Grau I";
		}else if(imc >= 35 && imc < 40) {
			diagnostico = "Obesidade Grau II";
		}else {
			diagnostico = "Obesidade Grau III - (Obesidade Morbida)";
		}
		return diagnostico;
	}
}
