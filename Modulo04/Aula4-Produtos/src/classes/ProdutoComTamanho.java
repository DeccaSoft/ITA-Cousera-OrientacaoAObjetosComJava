package classes;
/**
 * 
 * @author André Morais de Azevedo
 * @Date 19/08/2020 14:50
 *
 */
public class ProdutoComTamanho extends Produto {

	public int tamanho;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho + codigo != other.tamanho + other.codigo)
			return false;
		return true;
	}

	
	
	
}
