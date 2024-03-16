import java.util.ArrayList;
import java.util.List;

class Student{
    private String st_name;
    private String st_id;
    private List<Double> grades;

    String get_name(){
         return st_name;
    }
    void set_name(String st_name){
        this.st_name=st_name;
    }
    String get_id(){
        return st_id;
    }
    void set_id(String st_id){
        this.st_id=st_id;
    }

public List<Double> getGrade(){
    return grades;
}
public void addGrade(double grade){
    if(grades == null){
        grades=new ArrayList<>();
    }
    grades.add(grade);
}
}

public class EncapsulationEx {
    public static void main(String[] args) {
        Student student=new Student();

        student.set_id("16");
        student.set_name("Sohail");

        student.addGrade(45);
        student.addGrade(76);
        student.addGrade(98);

        String st_id=student.get_id();
        String st_name=student.get_name();
        List <Double> grades=student.getGrade();
        System.out.println("Student ID : "+st_id);
        System.out.println("Student name : "+st_name);
        System.out.println("Grades : "+grades);
        
    }
}
