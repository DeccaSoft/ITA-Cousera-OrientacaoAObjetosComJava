
public class ProdutoComTamanho extends Produto {

	private int tamanho;
	
	public ProdutoComTamanho(int codigo,String nome, int tamanho,double preco) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
		
	}

//  m�todo hashCode() - sobrescrita
	@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result  + tamanho;
			return result;
		}


//  m�todo equals() - sobrescrita
	@Override
	public boolean equals(Object object) {
		  if (!(object instanceof ProdutoComTamanho)) // Testa se tipo de objeto passado � tipo ProdutoComTamanho
		    return false;
		  ProdutoComTamanho outroProduto = (ProdutoComTamanho) object;
		  
		 // comparar  hashCode
		  if (this.hashCode() == outroProduto.hashCode())
					  return true;
		  else return false;
	}
	
	
	
}
