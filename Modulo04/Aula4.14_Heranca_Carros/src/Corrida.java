import java.util.HashMap;
import java.util.Map;

public class Corrida {

	private int pista;
	
	private Map<CarroCorrida, Integer> carros = new HashMap<>();
	//Carro é a Chave e a Distancia percorrida por ele é o valor
	
	public Corrida(int tamanho) {
		pista = tamanho;
	}
	
	public void adicionaCarro(CarroCorrida carro) { //Pode ser uqalquer tipo de carro
		carros.put(carro, 0); //Carro adicionado e saindo da largada - km 0.
	}
	
	private boolean terminou() {
		for(Integer valor : carros.values()) {
			if(valor >= pista) {
				return true;
			}
		}
		return false;
	}
	
	public void umDoisTresEJa() {
		while(!terminou()) { 	//Enquanto a corrida não terminar...
			for(CarroCorrida carro : carros.keySet()) { //Pego cada carro e realizo o cilco a seguir:
				carro.acelerar();						//Acelero o acarro
				int distancia = carros.get(carro);		//Pega a distancia atual daquele carro
				distancia += carro.getVelocidade();		//Incrementa a distancia com a velocidade
				carros.put(carro, distancia);			//Coloco a nova distancia percorrida
			}
		}
		for(CarroCorrida carro : carros.keySet()) {
			System.out.println(carro.getNome() + " - " + carros.get(carro));
		}
	}
}
