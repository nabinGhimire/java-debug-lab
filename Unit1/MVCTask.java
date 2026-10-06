// MVC Task - Find and fix all errors
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class StudentView {
    public void displayStudent(String name, int age) {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentAge(int age) {
        // model.setAge(age); - missing
    }

    public void updateView() {
        view.displayStudent(model.getName(), model.getAge());
    }
}

public class MVCTask {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.setStudentName("Alice");
        controller.setStudentAge(20);
        controller.updateView();
    }
}
