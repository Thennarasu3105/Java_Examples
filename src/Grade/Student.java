package Grade;

public class Student {
    private String Name;
    private String studentId;
    private double marks;
    private String grade;

    Student(String Name,String studentId,double marks,String grade){
        this.Name = Name;
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
