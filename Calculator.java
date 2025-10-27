

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Calculator {

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
	            throw new ArithmeticException("Error: Division by zero is not allowed.");
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Calculator calculator = new Calculator();

	        try {
	            System.out.print("Enter the first number (a): ");
	            double a = scanner.nextDouble();

	            System.out.print("Enter the second number (b): ");
	            double b = scanner.nextDouble();
	            scanner.nextLine(); // Consume the newline character

	            System.out.print("Enter the type of operation (+, -, *, /): ");
	            String operation = scanner.nextLine();

	            double result;

	            switch (operation) {
	                case "+":
	                    result = calculator.add(a, b);
	                    System.out.println("Result of Addition: " + result);
	                    break;
	                case "-":
	                    result = calculator.subtract(a, b);
	                    System.out.println("Result of Subtraction: " + result);
	                    break;
	                case "*":
	                    result = calculator.multiply(a, b);
	                    System.out.println("Result of Multiplication: " + result);
	                    break;
	                case "/":
	                    result = calculator.divide(a, b);
	                    System.out.println("Result of Division: " + result);
	                    break;
	                default:
	                    System.out.println("Invalid operation. Please choose from +, -, *, /.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter valid numbers.");
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}


