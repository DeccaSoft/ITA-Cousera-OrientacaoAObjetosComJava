import java.text.ParseException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NiverTest {
	
	@Test
	void test1() throws ParseException {
		Pessoa sam = new Pessoa("20/12/1983");
		
		Assert.assertEquals("Sagitário",sam.getSigno());
		Assert.assertEquals(36,sam.getIdade());	
	}
	
	@Test
	void test2() throws ParseException {
		Pessoa evy = new Pessoa("07/5/1992");
		
		Assert.assertEquals("Touro",evy.getSigno());
		Assert.assertEquals(28,evy.getIdade());
	}
	@Test
	void test3() throws ParseException {
		Pessoa ben = new Pessoa("29/6/2017");
		
		Assert.assertEquals("Câncer", ben.getSigno());
		Assert.assertEquals(3, ben.getIdade());
	}

}
