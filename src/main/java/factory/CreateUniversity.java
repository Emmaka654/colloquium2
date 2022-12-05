package factory;

import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;

public class CreateUniversity {
    private final Students student;
    private final Teachers teacher;
    private final Staff staff;

    public CreateUniversity(GUIFactory factory) {
        System.out.println("Creating university");
        this.student = factory.study();
        this.teacher = factory.teach();
        this.staff = factory.help();
    }
}
