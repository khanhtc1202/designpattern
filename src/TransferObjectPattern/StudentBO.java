package TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<StudentVO> students;

    public StudentBO() {
        this.students = new ArrayList<StudentVO>();

        students.add(new StudentVO("khanh", 0));
        students.add(new StudentVO("tran", 1));
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
    }
}
