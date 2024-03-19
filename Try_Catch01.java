// This is a simple program check if user input positive numbers then throws exception and if user input negative number then print negative number 

import java.util.Scanner;
class IllegalArgumentException extends Exception {
    IllegalArgumentException(String nm) {
        super(nm);
    }
}

public class Try_Catch01 {

    public void check_Num(int num) throws IllegalArgumentException {
        if (num>=0) {
            throw new IllegalArgumentException("The number is positve");
        } else {
            System.out.println("The number is negative ");
        }

    }

    public static void main(String[] args) {
        Try_Catch01 obj = new Try_Catch01();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numbers : ");
            int num = sc.nextInt();
            obj.check_Num(num);

        } catch (IllegalArgumentException e) {
            System.out.println(e);

        }

        sc.close();
    }
}
