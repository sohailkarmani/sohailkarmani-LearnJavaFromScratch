//package oops;
public class Main {
    public static void main(String[] args) {
        Cat cat1=new Cat(false,"milk", 4,"Black");
        System.out.println("Cat is Vegetarian "+cat1.isVegetarian());
        System.out.println("Cat Eats "+cat1.getEats());
        System.out.println("Cat has "+cat1.getNoOfLegs()+" legs");
        System.out.println("Cat color is "+cat1.getColor());

    }
}
