// Problem-1.java
import java.util.Scanner;

class Calculator {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    // Unified method to perform operation based on user input
    public double calculate(double a, double b, String operation) {
        operation = operation.toLowerCase();
        if (operation.equals("add") || operation.equals("+")) {
            return add(a, b);
        } else if (operation.equals("subtract") || operation.equals("-")) {
            return subtract(a, b);
        } else if (operation.equals("multiply") || operation.equals("*")) {
            return multiply(a, b);
        } else if (operation.equals("divide") || operation.equals("/")) {
            return divide(a, b);
        } else {
            System.out.println("Invalid operation!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);

        sc.close();
    }
}
