package com.afornalik;

public class PolishNotation {

    private String operation;
    private int firstNumber;
    private int secondNumber;

    public PolishNotation(String operation) {
        this.operation = operation;
    }

    public int calculateResult() throws StringIncorrectLengthException {
        if (checkLength()) {
            return doOperations();
        }
        return -1;
    }

    public boolean checkLength() throws StringIncorrectLengthException {
        if (operation.length() != 3) {
            throw new StringIncorrectLengthException();
        } else {
            return true;
        }
    }

    private int doOperations() {
        parseNumbers();
        String mark = operation.substring(2, 3);
        switch (mark) {
            case "+": {
                return firstNumber + secondNumber;
            }
            case "-": {
                return firstNumber - secondNumber;
            }
            case "/": {
                return firstNumber / secondNumber;
            }
            case "*": {
                return firstNumber * secondNumber;
            }
        }
        return -1;
    }

    private void parseNumbers() throws NumberFormatException {
        firstNumber = Integer.parseInt(operation.substring(0, 1));
        secondNumber = Integer.parseInt(operation.substring(1, 2));

    }


}
