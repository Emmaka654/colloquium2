package factory;

import classes.windowClasses.WindowStaff;
import classes.windowClasses.WindowStudent;
import classes.windowClasses.WindowTeachers;
import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;

public class WindowsGUIFactory implements GUIFactory {
    public WindowsGUIFactory() {
        System.out.println("Creating gui factory for Windows OS");
    }

    public Students study() {
        System.out.println("Student study (for Windows OS)");
        return new WindowStudent();
    }

    public Teachers teach() {
        System.out.println("Teacher teach (for Windows OS)");
        return new WindowTeachers();
    }

    public Staff help() {
        System.out.println("Staff help everyone (for Windows OS)");
        return new WindowStaff();
    }
}
