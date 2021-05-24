
import java.util.ArrayList;
import java.util.HashMap;


public class Pizza {
	
	private int valorTotalDosIngredientes = 0;//armazena o valor total da instancia
	public static HashMap<String,Integer> lista = new HashMap<String,Integer>();//lista da classe para registrar os ingredientes e suas frequencias quando utilizados
	private ArrayList<String> ingredPizza = new ArrayList<String>();//Array para armazenar somente os ingredientes para posterior utilização no método getPreco
	
	//adiciona os ingredientes	
	public void  adicionaIngrediente(String ingrediente) {
		ingredPizza.add(ingrediente);
		contabilizaIngrediente(ingrediente);
		
	}
	//configura a variável valorTotalDosIngredientes
	public void setValorTotalDosIngredientes(int valorTotalDosIngredientes) {
		this.valorTotalDosIngredientes = valorTotalDosIngredientes;
	}
	//recupera variável valorTotalDosIngredientes
	public int getValorTotalDosIngredientes() {
		return valorTotalDosIngredientes;
	}
	
	//define o valor de valorTotalDosIngredientes
	public int getPreco() {
		if(ingredPizza.size() <= 2) {
			 setValorTotalDosIngredientes(15);
		}else if(ingredPizza.size() > 2 && ingredPizza.size() <= 5){
			 setValorTotalDosIngredientes(20);
		}else if( ingredPizza.size() > 5){
			 setValorTotalDosIngredientes(23);
		}else if(ingredPizza.size() == 0)
			setValorTotalDosIngredientes(0);
		
		
		return getValorTotalDosIngredientes();
		
	}
	//insere o ingrediente como uma chave no mapa, e se hover repetição do ingrediente a ser inserido, adiciona 1 no valor  chave.
	private void contabilizaIngrediente(String ingrediente) {
		if(lista.containsKey(ingrediente)) {
			Integer contador = lista.get(ingrediente);
			lista.put(ingrediente, contador + 1);
		}else
			lista.put(ingrediente, 1);
	}

}


