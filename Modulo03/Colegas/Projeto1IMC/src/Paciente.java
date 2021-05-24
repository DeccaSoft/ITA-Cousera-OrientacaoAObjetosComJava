/*
 * Cálculo do IMC
 */

public class Paciente {
	
	double peso, altura;
	
	//Construtor
	
	Paciente (double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	//Método para calcular IMC
	
	double calcularIMC(){
		double imc;
		
		imc = peso / (altura * altura);
		return imc;
		
	}// fim calcularIMC()
	
	//Método para calcular Classificação
	
	String diagnostico() {
		
		/*
		 	Baixo peso muito grave = IMC abaixo de 16 kg/m²
			Baixo peso grave = IMC entre 16 e 16,99 kg/m²
			Baixo peso = IMC entre 17 e 18,49 kg/m²
			Peso normal = IMC entre 18,50 e 24,99 kg/m²
			Sobrepeso = IMC entre 25 e 29,99 kg/m²
			Obesidade grau I = IMC entre 30 e 34,99 kg/m²
			Obesidade grau II = IMC entre 35 e 39,99 kg/m²
			Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
		 */
		
		double imc_res;
		String classificacao = null;
		
		imc_res = calcularIMC();
		
		if(imc_res < 16) {
			classificacao = " -> Baixo peso muito grave.";
		}else if ( (imc_res >= 16) && (imc_res < 16.99)) {
			classificacao = " -> Baixo peso grave.";
			} else if ( (imc_res >= 17) && (imc_res < 18.49)) {
				classificacao = " -> Baixo peso.";
				} else if ( (imc_res >= 18.50) && (imc_res < 24.99)) {
					classificacao = " -> Peso normal.";
					} else if ( (imc_res >= 25) && (imc_res < 29.99)) {
						classificacao = " -> Sobrepeso.";
						} else if ( (imc_res >= 30) && (imc_res < 34.99)) {
							classificacao = " -> Obesidade grau I.";
							} else if ( (imc_res >= 35) && (imc_res < 39.99)) {
								classificacao = " -> Obesidade grau II.";
								} else if (imc_res >= 40) {
									classificacao = " -> Obesidade grau III (obesidade mórbida).";
									}
		return classificacao;
		
	}

}
