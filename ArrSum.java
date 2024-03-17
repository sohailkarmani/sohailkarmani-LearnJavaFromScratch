import java.util.Scanner;

public class ArrSum {

    static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        System.out.print("The sum of arr is  : " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr);
        sc.close();
    }
}
