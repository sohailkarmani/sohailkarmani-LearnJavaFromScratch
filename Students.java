class Students{
    int StudentID;
    String StudentName;
    String StudentCity;

    public void study(){
        System.out.println(StudentName+" is studying");
    }
    public void ShowInfo(){
        System.out.println("My ID is "+StudentID);
        System.out.println("My name is "+StudentName);
        System.out.println("My City is "+StudentCity);

    }

    public static void main(String[] args){
        Students s1;
        s1=new Students();
        s1.StudentID=16;
        s1.StudentName="Sohail";
        s1.StudentCity="Hyderabad";
        s1.study();
        s1.ShowInfo();

        Students s2=new Students();
        s2.StudentID=15;
        s2.StudentName="Sandeep";
        s2.StudentCity="Jamshoro";

        s2.study();
        s2.ShowInfo();
    }
}