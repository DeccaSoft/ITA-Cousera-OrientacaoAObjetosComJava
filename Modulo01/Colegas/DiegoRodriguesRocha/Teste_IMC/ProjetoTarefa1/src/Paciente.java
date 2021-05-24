public class Paciente {
	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return (peso / (altura * altura));
	}
	
	public String diagnostico() {
		String Result;
		
		double imc = calcularIMC();
		
		if (imc < 16) {
			Result = "Baixo peso muito grave = IMC abaixo de 16 kg/m�";
		}
		else if (imc >= 16 && imc <= 16.99) {
			Result = "Baixo peso grave = IMC entre 16 e 16,99 kg/m�";
		}
		else if (imc >= 17 && imc <= 18.49) {
			Result = "Baixo peso = IMC entre 17 e 18,49 kg/m�";
		}
		else if (imc >= 18.50 && imc <= 24.99) {
			Result = "Peso normal = IMC entre 18,50 e 24,99 kg/m�";
		}
		else if (imc >= 25 && imc <= 29.99) {
			Result = "Sobrepeso = IMC entre 25 e 29,99 kg/m�";
		}
		else if (imc >= 30 && imc <= 34.99) {
			Result = "Obesidade grau I = IMC entre 30 e 34,99 kg/m�";
		}
		else if (imc >= 35 && imc <= 39.99) {
			Result = "Obesidade grau II = IMC entre 35 e 39,99 kg/m�";
		}
		else {
			Result = "Obesidade grau III (obesidade m�rbida) = IMC maior que 40 kg/m�";
		}
		
		return Result;
	}
}
