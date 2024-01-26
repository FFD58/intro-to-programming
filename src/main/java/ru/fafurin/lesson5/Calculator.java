package ru.fafurin.lesson5;

import java.util.Scanner;

public class Calculator {

    private final Scanner scanner;

    public Calculator(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Welcome to ICalculator v.0.1 \n" +
                "Please, enter the mathematical expression (for example: 5 / 4 * 7): \n" +
                "Each number or operator starts on a new line \n" +
                "Available operators: + - / * ^";
    }

    public void start() {
        double x = this.scanner.nextDouble();
        char operator1 = operatorCheck();
        double y = this.scanner.nextDouble();
        char operator2 = operatorCheck();
        double z = this.scanner.nextDouble();
        System.out.println("=");
        if (operatorPriority(operator1)) {
            System.out.println(calc(operator2, calc(operator1, x, y), z));
        } else System.out.println(calc(operator1, calc(operator2, y, z), x));
    }

    // выполняет арифметические операции
    private double calc(char operator, double x, double y) {
        double res = 0;
        switch (operator) {
            case '+' -> res = x + y;
            case '-' -> res = x - y;
            case '/' -> res = x / y;
            case '*' -> res = x * y;
            case '^' -> res = Math.pow(x, y);
        }
        return res;
    }

    // определяет приоритет операторов
    private boolean operatorPriority(char operator) {
        return operator == '/' || operator == '*' || operator == '^';
    }

    // проверяет корректны ли операторы
    private char operatorCheck() {
        char operator = this.scanner.next().charAt(0);
        while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^') {
            System.out.print("Enter the correct mathematical action: ");
            operator = this.scanner.next().charAt(0);
        }
        return operator;
    }

}
