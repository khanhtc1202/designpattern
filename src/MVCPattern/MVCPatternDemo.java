package MVCPattern;

import MVCPattern.controler.StudentController;
import MVCPattern.model.Student;
import MVCPattern.view.StudentView;

/**
 * Created by khanhtc on 4/28/17.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("khanh");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("khanhtc");
        student.setRollNo("10");
        return student;
    }
}
