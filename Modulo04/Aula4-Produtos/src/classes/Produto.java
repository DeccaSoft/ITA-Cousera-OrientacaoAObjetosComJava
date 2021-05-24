package classes;
/**
 * 
 * @author André Morais de Azevedo
 * @Date 19/08/2020 14:50
 *
 */
public class Produto {

	public String nome;
	public int codigo;
	public double preco;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
}
