abstract class abstractDemo {
    abstract void display();
    
}
public class myClass extends abstractDemo{
    void display(){
        System.out.println("This is abstract method......");
    }
    public static void main(String[] args) {
        myClass ob=new myClass();
        ob.display();
        
    }
    
    
}

