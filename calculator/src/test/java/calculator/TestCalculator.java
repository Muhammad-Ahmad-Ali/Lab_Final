package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {
private static Calculator calculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
		calculator = new Calculator();
	}
	
	@Test  
	public void testFindMax(){  
		assertEquals(4,calculator.findMax(1,3,4)); 
	}
	
	@Test  
	public void testFindMax1(){ 
		assertEquals(0,calculator.findMax(-12,0,-2));  
	}
	
	@Test  
	public void testFindMax2(){  
		assertEquals(-1,calculator.findMax(-120,-1,-200));  
	}
	
	@Test  
	public void testSquare1(){  
		assertEquals(9,calculator.square(3));  
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare3(){  
		calculator.square(0);  
	}
	
	@Test  
	public void testCube(){  
		assertEquals(27,calculator.cube(3));  
	}
	
	@Test  
	public void testCube1(){  
		assertEquals(0,calculator.cube(0));  
	}
	
	@Test  
	public void testCube2(){  
		assertEquals(-27,calculator.cube(-3));  
	}
	
	@AfterClass
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }

}
