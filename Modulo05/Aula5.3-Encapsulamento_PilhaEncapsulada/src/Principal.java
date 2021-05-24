
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("André");
		p.empilhar("Morais");
		p.empilhar("Azevedo");
		System.out.println("Topo da Pilha: " + p.topo());
		System.out.println("Tamanho da Pilha: " + p.tamanho());
		
		//Aula Extra 5.10...
		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[1] = "OUTRO";
		
		System.out.println("---------------------------");
		System.out.println("Desempilhando..." + p.desempilhar());
		System.out.println("Topo da Pilha: " + p.topo());
		System.out.println("Tamanho da Pilha: " + p.tamanho());
		
		System.out.println(p.getElementos().length);
	}

}
