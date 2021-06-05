package gt.edu.umg.view;

import gt.edu.umg.model.StudentEntity;
import java.util.List;

public class StudentView {

    public StudentView() {
    }

    // ver estudiante
    public void printStudent(StudentEntity student) {
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("----------------------------------------");
        System.out.println(String.format("No. carné: %s", student.getStudentId()));
        System.out.println(String.format("Nombre completo: %s", student.getFullName()));
        System.out.println("----------------------------------------");
    }
    
    public void printStudents(List<StudentEntity> students) {
        System.out.println("ESTUDIANTES");
        System.out.println("----------------------------------------");
        
        for (StudentEntity student : students) {        
            System.out.print(String.format("%s\t", student.getStudentId()));
            System.out.println(student.getFullName());        
        }
        
        System.out.println("----------------------------------------");
    }

}