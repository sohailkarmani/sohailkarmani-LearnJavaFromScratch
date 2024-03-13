

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;

    }
}
class Emp extends Person{

    float salry;
    Emp(int id,String name,float salry){
    super(id,name);
    this.salry=salry;
    }
    void display(){
        System.out.println(name+"  "+id+"  "+salry);
    }

}
public class TestSuper {
    public static void main(String[] args) {
        Emp e1=new Emp(16, "Sohail",10000);
        e1.display();

        
    }
}
