import java.util.HashMap;     // não verifica se o mesmo ingrdiente jã foi adicionado. 
import java.util.List;       //  Não repete os mesmos ingredientes. 
import java.util.ArrayList; // é um tipo de implementação de lista. implementada como vetor.

public class Pizza {
	double preco; 
	static int contabiliza=0; 
	int contador; 
	List <String> lista = new ArrayList<String>(); 
	
	public void adicionaIngrediente(String ingrediente) {
		lista.add(ingrediente);              // adicionar alimentos; 
		 contabilizaIngrediente(ingrediente); 
	}
	
		public static void contabilizaIngrediente(String ingrediente) {
			HashMap<String,Integer> map = new HashMap<String,Integer>(); 
			 map.put (ingrediente,contabiliza++); 

		}
		
		
		public double getPreco() {
			contador = this.lista.size();      // descobrir quantos elementos há em ArrayList; 
			double valorPago =0; 
			if (2 >= contador) {
				valorPago= 15.00; 
			}
			if (contador >= 3 && contador <= 5) {
				valorPago= 20.00;
			}
			if (contador > 5) {
				valorPago= 23.00; 
			}
			return valorPago; 
			}
		
		public static void zerarIngredientes() {
			contabiliza =0; 
		}
			
		}
		
	
	

