package calculaIMC;

public class Paciente {
	double peso; 
	double altura; 


	Paciente (double peso, double altura){
		this.peso = peso; 
		this.altura = altura;
	}
		 public double calcularIMC () {
			return (peso/(altura*altura)); 
		 }
		 
		 public String diagnostico() {
			 String resultado = ""; 
			 if (calcularIMC() < 16) {
				 resultado = "Baixo peso muito grave"; 
			 }
			 if ((calcularIMC()>= 16) &&(calcularIMC()<= 16.99)) {
				 resultado = "Baixo peso grave"; 
			 }
			 if ((calcularIMC()>= 17) &&(calcularIMC()<= 18.49)) {
				 resultado = "Baixo peso"; 
			 }
			 if ((calcularIMC()>= 18.50) &&(calcularIMC()<= 24.99)) {
				 resultado = "Peso normal";
			 }
			 if ((calcularIMC()>= 25) &&(calcularIMC()<= 29.99)) {
				 resultado = "Sobrepeso";
			 }
			 if ((calcularIMC()>= 30) &&(calcularIMC()<= 34.99)) {
				 resultado = "Obesidade grau I"; 
		 }
			 if ((calcularIMC()>= 35) &&(calcularIMC()<= 39.99)) {
				 resultado = "Obesidade grau II"; 
			 }
			 if (calcularIMC()>= 40) {
				 resultado = "Obesidade grau III"; 
			 }
			 return resultado; 
}
		 void imprimir() {
			 System.out.println("O IMC do paciente é "+calcularIMC()+"kg/m² e está "+diagnostico());
		 }
}