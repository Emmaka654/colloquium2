package factory;


import classes.windowClasses.WindowStaff;
import classes.windowClasses.WindowTeachers;
import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class WindowsGUIFactoryTest {

    @Test
    void study() {
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Assertions.assertTrue(windowsGUIFactory.study() instanceof Students);
    }

    @Test
    void teach() {
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Assertions.assertTrue(windowsGUIFactory.teach() instanceof Teachers);
    }

    @Test
    void help() {
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Assertions.assertTrue(windowsGUIFactory.help() instanceof Staff);
    }
}