package factory;

import classes.macClasses.MacStaff;
import classes.macClasses.MacStudent;
import classes.macClasses.MacTeachers;
import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;

public class MacGUIFactory implements GUIFactory {
    public MacGUIFactory() {
        System.out.println("Creating gui factory for Mac OS");
    }

    public Students study() {
        System.out.println("Student study (for Mac OS)");
        return new MacStudent();
    }

    public Teachers teach() {
        System.out.println("Teacher teach (for Mac OS)");
        return new MacTeachers();
    }

    public Staff help() {
        System.out.println("Staff help everyone (for Mac OS)");
        return new MacStaff();
    }
}
