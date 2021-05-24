/**
 * 
 */

/**
 * @author Raphael
 *
 */
public class Paciente {
	
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC(){
		double imc = (this.getPeso()/(this.getAltura() * this.getAltura()));
		return imc;
	}
	
	public String diagnostico() {
		double imc = this.calcularIMC();
		String str = "";
		if (imc < 16.0) {
			str = "Baixo peso muito grave";
		} else if(imc >= 16.0 && imc < 17.0 ) {
			str = "Baixo peso grave";
		} else if(imc >= 17.0 && imc < 18.5) {
			str = "Baixo peso";
		} else if(imc >= 18.5 && imc < 25.0) {
			str = "Peso normal";
		} else if(imc >= 25.0 && imc < 30.0) {
			str = "Sobrepeso";
		} else if(imc >= 30.0 && imc < 35.0) {
			str = "Obesidade grau I";
		} else if(imc >= 35.0 && imc < 40.0) {
			str = "Obesidade grau II";
		} else {
			str = "Obesidade grau III (obesidade mórbida)";
		}
		return str;
	}
}

