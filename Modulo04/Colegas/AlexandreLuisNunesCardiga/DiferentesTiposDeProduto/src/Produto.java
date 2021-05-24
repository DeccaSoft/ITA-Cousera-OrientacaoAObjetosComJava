
public class Produto {
	private String nome;
	private int codigo;
	private double preco;

	public Produto (int codigo, String nome, double preco)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
//  método hashCode() - sobrescrita
	@Override
    public int hashCode() {
	        //deve ser o mesmo resultado para um mesmo objeto, não pode ser aleatório
        return this.codigo;
    }
	  
	 @Override
	  public boolean equals(Object obj) {
		 
	        //se nao forem objetos da mesma classe sao objetos diferentes
	        if(!(obj instanceof Produto)) return false; 

	        //se forem o mesmo objeto, retorna true
	        if(obj == this) return true;

	        // aqui o cast é seguro por causa do teste feito acima
	        Produto produto = (Produto) obj;
           
	        //comparar atributo por atributo
	        return this.codigo == produto.getCodigo() &&
	                this.nome.equals(produto.getNome());
	    }   

	
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	
}
