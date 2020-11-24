//import org.joda.time.LocalDate;
import org.graalvm.compiler.hotspot.nodes.EndLockScopeNode;

import java.time.*;
import java.util.*;
public class Course {
    private String name;
    private ArrayList<Student> Students;
    private ArrayList<Module> Module;
    private LocalDate StartDate;
    private LocalDate EndDate;

    public Course(String name, ArrayList<Student> students, ArrayList<Module> modules, LocalDate startDate, LocalDate endDate){
        this.name = name;
        Students = students;
        StartDate = startDate;
        EndDate = endDate;
        Module = modules;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Student> getStudents(){
        return Students;
    }

    public void setStudents(ArrayList<Student> students){
        Students = students;
    }

    public ArrayList<Module> getModule(){
        return Module;
    }

    public void setModule(ArrayList<Module> module){
        Module = module;
    }

    public LocalDate getStartedDate(){
        return StartDate;
    }

    public void setStartDate(LocalDate startDate){
        StartDate = startDate;
    }

    public LocalDate getEndDate(){
        return EndDate;
    }

    public void setEndDate(LocalDate endDate){
        EndDate = endDate;
    }

    public void AddStudentToCourse(Student student, Course course){
        if(this.Students.contains(student)){
            student.addCourse(course);
            return;

        }else{
            this.Students.add(student);
            student.addCourse(course);
        }

    }







}
