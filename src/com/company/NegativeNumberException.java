package com.company;

public class NegativeNumberException extends Exception {
    private int number;

    public NegativeNumberException(int number) {
        this.number = number;
    }

    //public int getNumber() {return number;}

  // @Override
    //public String getMessage() {return "negative number";}

}

