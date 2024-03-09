//package oops;

public class Exception_Example1 {
    public static void main(String[] args) {

        try {
            int result = divideNumbers(5, 0);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor== 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend/divisor;

    }

}
