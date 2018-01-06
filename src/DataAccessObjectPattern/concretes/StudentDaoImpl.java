package DataAccessObjectPattern.concretes;

import DataAccessObjectPattern.interfaces.StudentDao;
import DataAccessObjectPattern.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        for (Student student: students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        getStudent(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + " had been updated in database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + "had been deleted from database");
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }
}
