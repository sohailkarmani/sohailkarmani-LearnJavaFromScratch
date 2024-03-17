import java.util.Scanner;

public class FindMinArr {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        System.out.println("The min value of array is : " + min);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        min(arr);
        sc.close();

    }
}
