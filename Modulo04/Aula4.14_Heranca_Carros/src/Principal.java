
public class Principal {

	public static void main(String[] args) {
		Corrida corridaAmizade = new Corrida(2000);
		corridaAmizade.adicionaCarro(new CarroSoma("Carro Soma A", 10, 110));
		corridaAmizade.adicionaCarro(new CarroSoma("Carro Soma B", 8, 140));
		corridaAmizade.adicionaCarro(new CarroMult("Carro Mult C", 1.7, 100));
		corridaAmizade.adicionaCarro(new CarroMult("Carro Mult D", 1.4, 110));
		corridaAmizade.umDoisTresEJa();
	}

}
