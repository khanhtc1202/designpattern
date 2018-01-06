package DataAccessObjectPattern;

import DataAccessObjectPattern.concretes.StudentDaoImpl;
import DataAccessObjectPattern.interfaces.StudentDao;
import DataAccessObjectPattern.models.Student;

import java.util.List;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        studentDao.addStudent(new Student("khanhtc", 1));
        studentDao.addStudent(new Student("khanh", 2));

        printStudentList(studentDao.getAllStudents());

        Student firstStudent = studentDao.getStudent(1);
        if (firstStudent != null) {
            firstStudent.setName("khanh tran");
            studentDao.updateStudent(firstStudent);
        }

        printStudentList(studentDao.getAllStudents());
    }

    public static void printStudentList(List<Student> students) {
        for (Student student: students) {
            System.out.println("Student: [ Roll No: " + student.getRollNo() + ", Name: " + student.getName() + " ]");
        }
    }
}
