import java.util.Scanner;

public class addition {
    public void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("The sum of two number is :"+sum);
    }
    public static void main(String[] args) {
        addition ob=new addition();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for addition : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        ob.add(num1, num2);
        sc.close();
    }
}
