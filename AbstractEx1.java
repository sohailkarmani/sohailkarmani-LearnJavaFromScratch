

abstract class Animal1{
    public abstract void sound();
}
class Lion extends Animal1{
    public void sound(){
        System.out.println("Loin roars.....");
    }

}
class Tiger extends Animal1{
    public void sound(){
        System.out.println("Tiger growls......");
    }
}



public class AbstractEx1 {
    public static void main(String[] args) {
        Animal1 a1=new Lion();
        a1.sound();
        Animal1 a2=new Tiger();
        a2.sound();
    }
    
}
