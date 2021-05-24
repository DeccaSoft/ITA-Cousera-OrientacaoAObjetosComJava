package entities;

public class Paciente{

	public double Peso;
	public double Altura;
	
	public double CalcularIMC(double Peso, double Altura) {
		return (Peso / Math.pow(Altura, 2));
	}
		
	public String diagnostico(double x) {		
		
		if(x < 16)
			return "Baixo peso muito grave";
		
		else if(x >= 16 && x < 17) {
			return "Baixo peso grave";			
		}
		
		else if(x >= 17 && x < 18.50 ) {
			return "Baixo peso";
		}
		
		else if(x >= 18.50 && x < 25) {
			return "Peso normal";
		}
		
		else if(x >= 25 && x < 30) {
			return "Sobrepeso";
		}
		
		else if(x >= 30 && x < 35) {
			return "Obesidade grau I";
		}
		
		else if(x >= 35 && x < 40) {
			return "Obesidade grau II";
		}
		
		else if(x >= 40) {
			return "Obesidade grau III (obesidade mórbida)";
		}
		return null;
		
	}
}


