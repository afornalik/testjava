package com.afornalik;

public class FooBar {


    private int anyInt;

    public FooBar(int anyInt) {
        this.anyInt = anyInt;
    }

    public String asString() {
        if (anyInt % 3 == 0){
            return "Foo";

        }
        return String.valueOf(anyInt);
    }
}
