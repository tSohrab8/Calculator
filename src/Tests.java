import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		double result = calc.operation(120, 10, 4);
		assertTrue(result == 12);
	}
	
	@Test
	public void test2(){
		Calculator calc = new Calculator();
		double result = calc.operation(33, 3, 3);
		assertTrue(result == 99);
	}
	
	@Test
	public void test3(){
		Calculator calc = new Calculator();
		double result = calc.operation(100, 3, 5);
		assertTrue(result == 1);
	}

}
