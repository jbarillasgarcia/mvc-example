package gt.edu.umg.model;

public class StudentEntity {

    private String studentId;

    private String fullName;
    
    public StudentEntity() {
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

}