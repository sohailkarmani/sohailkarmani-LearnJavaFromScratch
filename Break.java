import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No  : ");
        int num=sc.nextInt();
        while (num<15) {
            if(num==10){
            break;
            }
        
        System.out.println(num);
        num++;
    }

    sc.close();
    }
}
