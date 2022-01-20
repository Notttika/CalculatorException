package com.company;


import java.util.Scanner;


public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate() {
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (DivisionByZero d) {
                System.out.println("Division by zero is not allowed");
            } catch (NumberFormatException ex) {
                System.out.println("Wrong input data!");
            } catch (NegativeNumberException e) {
                System.out.println("Negative number");
            }
        }
    }

    private double calculationStep() throws NegativeNumberException, DivisionByZero {
        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber < 0) {
            throw new NegativeNumberException(firstNumber);
        }
        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (secondNumber < 0) {
            throw new NegativeNumberException(secondNumber);
        }
        if (secondNumber == 0) {
            throw new DivisionByZero(secondNumber);
        }

        System.out.println("enter operation: +, -, *, /, to perform or q if you want to quit:");

        operation = scanner.nextLine();


        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) {
        double result;


        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = division(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                System.out.println("Select the required operation");
                break;
        }

        return result;
    }

    private double plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private double minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private double multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private double division(int numberOne, double numberTwo){
        return numberOne / numberTwo;
    }

}