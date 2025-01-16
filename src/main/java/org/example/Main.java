package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation: +, -, *, /, √");
        char operator = scanner.next().charAt(0);

        double num1, num2, result;

        switch (operator) {
            case '+':
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;

            case '-':
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            case '*':
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            case '/':
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '√':
                System.out.print("Enter the number to calculate the square root: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The square root is: " + result);
                } else {
                    System.out.println("Error: Square root of a negative number is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, /, or √.");
        }

        scanner.close();

        System.out.println("klevi");
    }
}
