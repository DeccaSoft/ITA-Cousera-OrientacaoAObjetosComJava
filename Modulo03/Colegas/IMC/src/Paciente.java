
public class Paciente {
	double peso;
	double altura;
	double imc;
	
	// Construtor
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	// Getters
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	public double getImc() {
		return imc;
	}
	
	double calcularIMC(){
		imc = (peso/(altura * altura));
		return imc;
	}
	
	void diagnostico(){
		getImc();
		if(imc < 16){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Baixo peso muito grave");
        }else if(imc >= 16 && imc <= 16.99){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Baixo peso grave");
        }else if(imc >= 17 && imc <= 18.49){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Baixo peso");
        }else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Peso normal");
        }else if(imc >= 25 && imc <= 29.99){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Sobrepeso");
        }else if(imc >= 30 && imc <= 34.99){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Obesidade grau I");
        }else if(imc >= 35 && imc <= 39.99){
            System.out.println("IMC: "+getImc()+" Diagnóstico: Obesidade grau II");
        }else {
            System.out.println("IMC: "+getImc()+" Diagnóstico: Obesidade grau III (Obesidade mórbida)");
        }
	}
}
