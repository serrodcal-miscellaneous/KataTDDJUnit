package org.serrodcal.kataTddStringCalculate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class StringCalculateTest {

	private StringCalculate calculate;
	
	@Before
    public void setUp() {
        this.calculate = new StringCalculate();
    }

    @After
    public void tearDown() {
       //TODO
    }
    
    @Test
    public void emptyShouldReturnZero(){    	
    	assertEquals(0, this.calculate.run(""));
    }
    
    @Test
    public void aNumberShouldReturnThisNumber(){    	
    	assertEquals(1, this.calculate.run("1"));
    }
    
    @Test
    public void twoNumbersShouldReturnAdd(){    	
    	assertEquals(3, this.calculate.run("1,2"));
    }
    
    @Test
    public void MultipleNumbersShouldReturnSum(){    	
    	assertEquals(6, this.calculate.run("1,2,3"));
    }
	
}
