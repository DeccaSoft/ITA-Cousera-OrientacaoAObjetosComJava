
public class ProdutoComTamanho extends Produto {
	int tamanho;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tamanho;
		result = prime * result + codigo;
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
		if (codigo != other.codigo)
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	
}
