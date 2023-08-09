package demo;

public class Operators {

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 5;
	        int result;

	        // Arithmetic operators
	        result = num1 + num2;
	        System.out.println("Addition: " + result);

	        result = num1 - num2;
	        System.out.println("Subtraction: " + result);

	        result = num1 * num2;
	        System.out.println("Multiplication: " + result);

	        result = num1 / num2;
	        System.out.println("Division: " + result);

	        result = num1 % num2;
	        System.out.println("Modulus: " + result);

	        // Relational operators
	        boolean isEqual = num1 == num2;
	        System.out.println("Equal: " + isEqual);

	        boolean isNotEqual = num1 != num2;
	        System.out.println("Not Equal: " + isNotEqual);

	        boolean isGreater = num1 > num2;
	        System.out.println("Greater Than: " + isGreater);

	        boolean isLess = num1 < num2;
	        System.out.println("Less Than: " + isLess);

	        boolean isGreaterOrEqual = num1 >= num2;
	        System.out.println("Greater Than or Equal: " + isGreaterOrEqual);

	        boolean isLessOrEqual = num1 <= num2;
	        System.out.println("Less Than or Equal: " + isLessOrEqual);

	        
	    }
	}
