package code401challenges.utilities;

import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testmultiBracketValidation_resultTrue() {
        String input = "{}";
        boolean result = multiBracketValidation(input);
        assertTrue(result);
        String inputTwo = "{}()[]";
        boolean resultTwo = multiBracketValidation(inputTwo);
        assertTrue(resultTwo);
        String inputThree = "{}{Code}[Fellows](())";
        boolean resultThree = multiBracketValidation(inputThree);
        assertTrue(resultThree);
    }

    @Test
    public void testmultiBracketValidation_resultFalse() {
        String input = "[({}]";
        boolean result = multiBracketValidation(input);
        assertFalse(result);
        String inputTwo = "(](";
        boolean resultTwo = multiBracketValidation(inputTwo);
        assertFalse(resultTwo);
    }

    @Test
    public void testmultiBracketValidation_resultFalseWithOneChar() {
        String input = "[";
        boolean result = multiBracketValidation(input);
        assertFalse(result);
        String inputTwo = ")";
        boolean resultTwo = multiBracketValidation(inputTwo);
        assertFalse(resultTwo);
    }

    @Test
            (expected = IllegalArgumentException.class)
    public void testmultiBracketValidation_withEmptyString() {
        String input = "";
        multiBracketValidation(input);
    }

    @Test
            (expected = IllegalArgumentException.class)
    public void testmultiBracketValidation_withNull() {
        multiBracketValidation(null);
    }
}