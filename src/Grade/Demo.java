package Grade;

public class Demo {
    public static void main(String[] args){
        Student student1,student2,student3;
        student1 = new Student("Thennarasu R","15BEC0911",95,"X");
        student2 = new Student("Arul P","15BEC0892",84,"X");
        student3 = new Student("Ranjith K","15BEC0898",55,"X");

        getgrade(student1);
        result(student1);
        getgrade(student2);
        result(student2);
        getgrade(student3);
        result(student3);

    }

    public static void getgrade(Student student){
        if(student.getMarks() >= 85)
            student.setGrade("A");
        else if(student.getMarks() >= 75)
            student.setGrade("B");
        else if(student.getMarks() >= 65)
            student.setGrade("C");
        else if(student.getMarks() >= 55)
            student.setGrade("D");
        else
            student.setGrade("E");

    }

    public static void result(Student student){
        System.out.println("Name   :" + student.getName());
        System.out.println("Reg.ID :" + student.getStudentId());
        System.out.println("Marks  :" + student.getMarks());
        System.out.println("Grade  :" + student.getGrade());
        System.out.println("**************************************************");
    }
}
