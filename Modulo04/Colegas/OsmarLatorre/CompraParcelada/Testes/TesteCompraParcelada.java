import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	//Teste compra á vista
	@Test
	public void testCompraAVista() {
		Compra c = new Compra(135.99);
        assertEquals(135.99, c.retornaTotal(), 0.01);
	}
	
	 //Testes compra parcelada
    @Test
    public void testCompraParcelada2X() {
        Compra c = new CompraParcelada(135.99,2,0.05f);
        assertEquals(136.13, c.retornaTotal(), 0.01);
    }

    @Test
    public void testCompraParcelada5X() {
        Compra c = new CompraParcelada(135.99,5,0.07f);
        assertEquals(136.47, c.retornaTotal(), 0.01);
    }

    @Test
    public void testCompraParcelada10X() {
        Compra c = new CompraParcelada(135.99,10,0.09f);
        assertEquals(137.22, c.retornaTotal(), 0.01);
    }


}
