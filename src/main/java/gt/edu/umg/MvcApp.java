package gt.edu.umg;

import gt.edu.umg.controller.StudentController;
import gt.edu.umg.model.StudentEntity;
import gt.edu.umg.view.StudentView;
import java.util.*;

public class MvcApp {

    public MvcApp() {
    }

    public static void main(String[] arg) {
        // crear un modelo
        StudentEntity model = new StudentEntity();
        model.setStudentId("1290-80-12345");
        model.setFullName("Josue Barillas");
        
        // crear una vista
        StudentView view = new StudentView();        
        
        // crear un cotrolador
        StudentController controller = new StudentController(model, view);
        
        controller.printStudent(model);
        
        //***************************************************************
        
        StudentEntity model2 = new StudentEntity();
        model2.setStudentId("1290-80-98465");
        model2.setFullName("Antonio Garcia");
        
        List<StudentEntity> students = new ArrayList();
        students.add(model);
        students.add(model2);
        
        controller.setStudents(students);
        
        controller.printStudents();
    }

}