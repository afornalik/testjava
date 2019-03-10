package com.afornalik;

import org.junit.Assert;
import org.junit.Test;

public class PolishNotationTest {

    @Test
    public void shouldStringHaveThreeCharacters() throws StringIncorrectLengthException {
        PolishNotation polishNotation = new PolishNotation("12+");

        boolean result = polishNotation.checkLength();
        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnTeen() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("25*");

        int result = polishNotation.calculateResult();
        Assert.assertEquals(10, result);
    }

    @Test
    public void shouldReturnThree() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("52-");

        int result = polishNotation.calculateResult();
        Assert.assertEquals(3, result);
    }

    @Test
    public void shouldReturnMinusOne() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("52(");

        int result = polishNotation.calculateResult();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void shouldReturnFour() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("82/");

        int result = polishNotation.calculateResult();
        Assert.assertEquals(4, result);
    }

    @Test
    public void shouldReturnThirteen() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("94+");

        int result = polishNotation.calculateResult();
        Assert.assertEquals(13, result);
    }

    @Test(expected = NumberFormatException.class)
    public void shouldThrowNumberFormatException() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("abc");

        polishNotation.calculateResult();
    }

    @Test(expected = StringIncorrectLengthException.class)
    public void shouldThrowStringIncorrectLengthException() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation2 = new PolishNotation("6+");
        PolishNotation polishNotation3 = new PolishNotation("6654+");
        PolishNotation polishNotation = new PolishNotation("123+");

        polishNotation.calculateResult();
        polishNotation2.calculateResult();
        polishNotation3.calculateResult();
    }

    @Test(expected = DivideByZeroException.class)
    public void shouldThrowDivideByZeroException() throws StringIncorrectLengthException, DivideByZeroException {
        PolishNotation polishNotation = new PolishNotation("30/");

        polishNotation.calculateResult();
    }



}
