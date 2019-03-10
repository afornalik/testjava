package com.afornalik;

public class PolishNotation {

    private String operation;
    private int firstNumber;
    private int secondNumber;

    public PolishNotation(String operation) {
        this.operation = operation;
    }

    public int calculateResult() throws StringIncorrectLengthException, DivideByZeroException {
        if (checkLength()) {
            return doOperations();
        }
        return -1;
    }

    //to delete
    public boolean checkLength() throws StringIncorrectLengthException {
        if (operation.length() != 3) {
            throw new StringIncorrectLengthException();
        } else {
            return true;
        }
    }

    private int doOperations() throws DivideByZeroException{
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
                if(checkIfCanDivide()) {
                    return firstNumber / secondNumber;
                }
            }
            case "*": {
                return firstNumber * secondNumber;
            }
        }
        return -1;
    }

    private boolean checkIfCanDivide() throws DivideByZeroException {
        if(secondNumber == 0){
            throw new DivideByZeroException();
        }else {
            return true;
        }
    }

    private void parseNumbers() throws NumberFormatException {
        firstNumber = Integer.parseInt(operation.substring(0, 1));
        secondNumber = Integer.parseInt(operation.substring(1, 2));

    }


}
