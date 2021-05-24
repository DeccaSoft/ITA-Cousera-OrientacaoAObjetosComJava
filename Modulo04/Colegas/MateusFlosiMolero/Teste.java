import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Teste {
	
	CompraParcelada c = new CompraParcelada(200, 1, 0.10);
	
	@Test
	public void Teste1()
	{
		assertEquals(200,00 , c.total());
	}
	
	@Test
	public void Teste2()
	{
		c.setParcelas(2);
		assertEquals(220,00 , c.total());
	}
	
	@Test
	public void Teste5()
	{
		c.setParcelas(5);
		c.setJuros(0.15);
		assertEquals(402,27 , c.total());
	}
	
	@Test
	public void Teste10()
	{
		c.setParcelas(10);
		c.setJuros(0.01);
		c.setValor(100.00);
		assertEquals(110,46 , c.total());
	}
}
