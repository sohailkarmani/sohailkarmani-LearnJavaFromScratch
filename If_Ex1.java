 
import java.util.Scanner;

public class If_Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number  :");
        int a = sc.nextInt();
        System.out.println("Enter second number  :");
        int b = sc.nextInt();

        // if else example for understanding
        // if (a == b)
        // {
        //     System.out.println("A is equal to B");
        // } else if (a < b) {
        //     System.out.println("A is less than b");
        // } else if (a > b) {
        //     System.out.println("a is greater than b");
        // } else {
        //     System.out.println("A is not equal to B");
        // }

        // for loop example 
        // if(a<b)
        // {
        //     for(int i=0;i<=a;i++)
        //     {
        //         System.out.println(i);
        //     }
        // }
        // else
        // {
        //     System.out.println("no");
        // }

        // while loop
        while (a<b) {
            System.out.println(a);
            a++;
            
        }

        sc.close();

    }
}