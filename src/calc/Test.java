/*
Project: Lab 14
Purpose Details: Simple Calculator
Course: IST 242
Author: Cassidy Czerpak
Date Developed: 6/19/19
Last Date Changed: 6/19/19
Revision: 1
*/

package calc;

import org.junit.*;
import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void additionUnitTestTrue() {
        assertTrue(Main.addition(5, 5) == 10);
    }

    @org.junit.Test
    public void additionUnitTestFalse() {
        assertFalse(Main.addition(5, 5) == 7);
    }


        @org.junit.Test
        public void subtractionUnitTestTrue() {
            assertTrue(Main.subtraction(10, 5) == 5);
        }

        @org.junit.Test
        public void subtractionUnitTestFalse() {
            assertFalse(Main.subtraction(5, 5) == 7);
    }

    @org.junit.Test
    public void divisionUnitTestTrue() {
        assertTrue(Main.division(10, 5) == 2);
    }

    @org.junit.Test
    public void divisionUnitTestFalse() {
        assertFalse(Main.division(5, 5) == 7);
    }

    @org.junit.Test
    public void multiplyUnitTestTrue() {
        assertTrue(Main.multiply(10, 5) == 50);
    }

    @org.junit.Test
    public void multiplyUnitTestFalse() {
        assertFalse(Main.multiply(5, 5) == 7);
    }
}

