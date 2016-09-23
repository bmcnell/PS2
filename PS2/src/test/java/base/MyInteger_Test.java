package base;
//bmcnell
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	static MyInteger firstNum = new MyInteger(11);
	static MyInteger secondNum = new MyInteger(8);
	
	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testIsEven() {
		assertFalse(firstNum.isEven());
		assertTrue(secondNum.isEven());
	}
	
	@Test
	public void testIsOdd() {
		assertTrue(firstNum.isOdd());
		assertFalse(secondNum.isOdd());
	}
	
	@Test
	public void testIsPrime(){
		assertTrue(firstNum.isPrime());
		assertFalse(secondNum.isPrime());
	}
	
	@Test
	public void testEquals() {
		assertTrue(firstNum.equals());
	}
}
