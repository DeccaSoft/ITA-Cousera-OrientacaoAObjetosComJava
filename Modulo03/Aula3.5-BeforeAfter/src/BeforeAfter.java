import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class BeforeAfter {

	@Before
	public void before() {
		System.out.println("Teste Before");
	}
	
	@After
	public void after() {
		System.out.println("Teste After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Teste Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Teste After Class");
	}
	
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}
	


}
