import java.util.*;

public class Student {

    private String name;
    private int age;
    private int id;
    private ArrayList<Course> Courses;
    private ArrayList<Module> Modules;
    private Date dob;

    public Student(String name, int age, int id, ArrayList<Course> courses, ArrayList<Module> modules, Date dob){
        this.name = name;
        this.age = age;
        this.id = id;

        this.Courses = courses;
        this.Modules = modules;
        this.dob = dob;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        age = age;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public Date getDOB(){
        return dob;
    }

    public void setDOB(Date dob){
        this.dob = dob;
    }


    public void addCourse(Course course){
        if(this.Courses.contains(course)){
            return;
        }
        else{
            this.Courses.add(course);
        }
    }

    public void addStudentToModule(Student student, Module module){
        if(module.getStudents().contains(student)){
            return;
        }else{
            student.Modules.add(module);
            module.addStudent(student, module);
            return;
        }
    }

}
