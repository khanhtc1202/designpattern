package MVCPattern.view;

/**
 * Created by khanhtc on 4/28/17.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRoolNo) {
        System.out.println("Student:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRoolNo);
    }
}
