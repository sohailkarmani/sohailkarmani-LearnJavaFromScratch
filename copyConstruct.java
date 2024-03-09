public class copyConstruct {
    int Id;
    String Name;
    copyConstruct(int i,String n)
    {
        this.Id=i;
        this.Name=n;

    }
    copyConstruct(copyConstruct s1){
        this.Id=s1.Id;
        this.Name=s1.Name;

    }
    void display(){
        System.out.println(Id+"......."+Name );
    }
    public static void main(String[] args) {
        copyConstruct ob=new copyConstruct(16,"Sohail");
        copyConstruct ob1=new copyConstruct(ob);
        ob.display();
        ob1.display();
    }
}
