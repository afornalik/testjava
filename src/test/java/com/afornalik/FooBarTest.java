package com.afornalik;

import org.junit.Assert;
import org.junit.Test;

public class FooBarTest {


    @Test
    public void shouldStringWhenIntGive() {
        int anyInt = 16;
        String anyIntAsString= "16";
        FooBar fooBar = new FooBar(anyInt);


        String result =fooBar.asString();


        Assert.assertEquals(anyIntAsString,result);
    }

    @Test
    public void shouldStringWhenDifferentIntGive() {
        int anyInt = 13;
        String anyIntAsString= "13";
        FooBar fooBar = new FooBar(anyInt);


        String result =fooBar.asString();


        Assert.assertEquals(anyIntAsString,result);
    }

    @Test
    public void shouldReturnFooWhenNumberIsDivisibleByThree() {

        int divisibleByThree = 69;

        FooBar fooBar = new FooBar(divisibleByThree);

        String result = fooBar.asString();

        Assert.assertEquals("Foo",result);
    }

    @Test
    public void shouldReturnFooWhenNumberIsDivisibleByTherteen() {

        int divisibleByThree = 30;

        FooBar fooBar = new FooBar(divisibleByThree);

        String result = fooBar.asString();

        Assert.assertEquals("Foo",result);
    }
}
