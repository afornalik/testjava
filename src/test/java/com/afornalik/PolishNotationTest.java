package com.afornalik;

import org.junit.Assert;
import org.junit.Test;

public class PolishNotationTest {

    @Test
    public void shouldStringHaveThreeCharacters() {

        PolishNotation polishNotation = new PolishNotation("12+");

        int result  = polishNotation.checkLength();

        Assert.assertEquals(3,result);


    }
/*
    @Test
    public void shouldBeAddCharacter() {

        PolishNotation polishNotation = new PolishNotation("12+");

        String result  = polishNotation.checkCharacter();

        Assert.assertEquals("+",result);

    }

    @Test
    public void shouldBeSubtractCharacter() {

        PolishNotation polishNotation = new PolishNotation("12-");

        String result  = polishNotation.checkCharacter();

        Assert.assertEquals("-",result);

    }

    @Test
    public void shouldBeDivisionCharacter() {

        PolishNotation polishNotation = new PolishNotation("12/");

        String result  = polishNotation.checkCharacter();

        Assert.assertEquals("/",result);

    }

    @Test
    public void shouldBeMultiplyCharacter() {

        PolishNotation polishNotation = new PolishNotation("12*");

        String result  = polishNotation.checkCharacter();

        Assert.assertEquals("*",result);

    }*/

    @Test
    public void shouldReturnTeen() {

        PolishNotation polishNotation = new PolishNotation("25+");

        int result  = polishNotation.result();

        Assert.assertEquals(7,result);

    }





}
