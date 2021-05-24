import java.util.Arrays;

public class Pilha {
	
	private Object[] elementos;
	private int topo = 0; //Guarda o topo da pilha
	
	
	public Pilha(int maximo) {
		
		elementos = new Object[maximo];
	}
	
	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}
	
	
	public Object topo() {
		return elementos[topo-1];
	}
	
	public int tamanho() {
		return topo;
	}

	//O Método foi modificado para se corrigir o fato de que não devemos retornar o array original,
	//mas, sim uma cópia do mesmo.
	public Object[] getElementos() {
		Object[] paraRetorno = Arrays.copyOf(elementos, tamanho());
		return paraRetorno;
	}

	//Retirado em outra aula
//	public void setElementos(Object[] elementos) {
//		this.elementos = elementos;
//	}

	//Foi retirado, pois o método tamanho faz a mesma coisa
//	public int getTopo() {
//		return topo;
//	}

	//O Método setTopo() não pode ser permitido,
	//pois se alterarmos o topo poderá gerar nullPointerException!
//	public void setTopo(int topo) {
//		this.topo = topo;
//	}
	
	
}
