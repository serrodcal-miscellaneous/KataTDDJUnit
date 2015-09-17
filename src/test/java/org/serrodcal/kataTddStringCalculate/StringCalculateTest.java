package org.serrodcal.kataTddStringCalculate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class StringCalculateTest {

	@Before
    public void setUp() {
        //TODO
    }

    @After
    public void tearDown() {
       //TODO
    }
    
    @Test
    public void emptyShouldReturnZero(){
    	StringCalculate calculate = new StringCalculate();
    	
    	assertEquals(0, calculate.run(""));
    }
    
    @Test
    public void aNumberShouldReturnThisNumber(){
    	StringCalculate calculate = new StringCalculate();
    	
    	assertEquals(1, calculate.run("1"));
    }
	
}
