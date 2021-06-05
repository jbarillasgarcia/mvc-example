package gt.edu.umg.controller;

import gt.edu.umg.model.StudentEntity;
import gt.edu.umg.view.StudentView;
import java.util.List;

public class StudentController {

    public StudentView studentView;
    public StudentEntity studentEntity;
    public List<StudentEntity> students;
    
    public StudentController(StudentEntity model, StudentView view) {
        this.studentEntity = model;
        this.studentView = view;
    }    

    public void printStudent(StudentEntity student) {
        this.studentView.printStudent(student);
    }
    
    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
    
    public void printStudents() {
        this.studentView.printStudents(students);
    }

}