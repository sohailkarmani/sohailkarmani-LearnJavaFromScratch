//package oops;

import java.util.Scanner;

public class ShopingApp {
    public static void main(String[] args) {
        Shoping s1 = new Shoping();
        Scanner sc = new Scanner(System.in);
         
        System.out.println("What type of oranges would you like?");

        int appleSelected = sc.nextInt();

       s1.setApple(appleSelected);
       System.out.println(appleSelected);
       sc.close();

    }
}