import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteCompra {
	
	@Test
	public void Teste1Parcela(){
		CompraParcelada cp = new CompraParcelada(100, 1, 0.10);
		assertEquals(110, cp.total(), 0.1);
	}
	
	@Test
	public void Teste2Parcelas(){
		CompraParcelada cp = new CompraParcelada(121, 2, 0.10);
		assertEquals(121, cp.total(), 0.1);
	}
	
	@Test
	public void Teste5Parcelas(){
		CompraParcelada cp = new CompraParcelada(100, 5, 0.10);
		assertEquals(161.05, cp.total(), 0.1);
	}
	
	@Test
	public void Teste10Parcelas(){
		CompraParcelada cp = new CompraParcelada(100, 10, 0.10);
		assertEquals(259.37, cp.total(), 0.1);
	}

}
