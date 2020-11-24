import java.util.ArrayList;
public class Module {

    private String name;
    private String id;
    private ArrayList<Student> Students;
    private ArrayList<Course> Courses;

    public Module(String name, String id, ArrayList<Student> students, ArrayList<Course> courses){
        this.name = name;
        this.id = id;
        Students = students;
        Courses = courses;

    }


public String getName(){
        return name;
}

public void setName(String name){
        this.name = name;
}

    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

public ArrayList<Student> getStudents(){
        return Students;
}

public void setStudents(ArrayList<Student> students){
        Students = students;
}

public ArrayList<Course> getCourses(){
        return Courses;
}

public void setCourses(ArrayList<Course> courses){
        Courses = courses;
}

public void addStudent(Student student, Module module){
        if(this.getStudents().contains(student)){
            return;
        }else{
            module.Students.add(student);
        }
}

public void addMToCourse(Module module, Course course){
        if(course.getModule().contains(module)){
            course.addMToCourse(module, course);
            return;
        }else{
            module.Courses.add(course);
            Courses.addMToCourse(module, course);
        }
}










}
