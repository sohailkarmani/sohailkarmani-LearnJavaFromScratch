
class Inherit2 {
    void eat(){
        System.out.println("Eating");
    }

}
    class Animal extends Inherit2{
        void walking(){
            System.out.println("walking");
        }
    }

class Inherit{
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.eat();
        a1.walking();

        
        
    }

}
