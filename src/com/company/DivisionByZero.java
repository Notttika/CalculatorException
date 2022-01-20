package com.company;

public class DivisionByZero extends Exception {
    private int number;

    public DivisionByZero(int number) {
        this.number = number;
    }
}
