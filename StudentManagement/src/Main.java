import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        Student student = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        student.setGroup("K62CC");
        StudentManagement sm = new StudentManagement();
        sm.addStudent(s);
        sm.addStudent(student);
        sm.addStudent(new Student());
        System.out.println(sm.studentsByGroup());

    }
}