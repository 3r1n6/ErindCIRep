package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Calculator!");
            System.out.println("Choose an operation: +, -, *, /");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
            }

            scanner.close();
        }
    }
