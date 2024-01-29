package com.blueyonder.day9.testingProject.testCalculator;

import com.blueyonder.day9.testingProject.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Before
    public void inputValues(){
        System.out.println("Before executing @Test");
        System.out.println("....");
    }

    @After
    public void checking(){
        System.out.println("Finished checking");
    }

    @Test
    public void testFindFact(){
        assertEquals(1, calculator.findFact(0));
        assertEquals(2, calculator.findFact(2));
        assertEquals(6, calculator.findFact(3));
    }

    @Test
    public void testFindSum(){
        assertEquals(3, calculator.add(1, 2));
        assertEquals(7, calculator.add(3, 4));
        assertEquals(10, calculator.add(3, 7));
    }
}
