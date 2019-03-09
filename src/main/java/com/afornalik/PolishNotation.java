package com.afornalik;

public class PolishNotation {

    private String operation;


    public PolishNotation(String operation) {
        this.operation = operation;
    }

    public int checkLength() {
       return operation.length();
    }

    public String checkCharacter() {
       return operation.substring(2);
    }

    public int result() {
        int a = Integer.parseInt(operation.substring(0,1));
        int b = Integer.parseInt(operation.substring(1,2));
        String s = operation.substring(2,3);
        switch (s) {
            case "+" :{
                return a+b;
            }case "-" :{
                return a-b;
            }case "/" :{
                return a/b;
            }case "*" :{
                return a*b;
            }
        }
        return 0;
    }
}
