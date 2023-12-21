package Practice_17.Exercise_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setName("Sarah");
        System.out.println("Student view after updating: ");
        controller.updateView();
    }
    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Lea");
        student.setRollNo("hz");
        return student;
    }
}
