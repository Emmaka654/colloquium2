package factory;

import classes.windowClasses.WindowStudent;
import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MacGUIFactoryTest {

    @Test
    void study() {
        MacGUIFactory macGUIFactory = new MacGUIFactory();
        Assertions.assertTrue(macGUIFactory.study() instanceof Students);
    }

    @Test
    void teach() {
        MacGUIFactory macGUIFactory = new MacGUIFactory();
        Assertions.assertTrue(macGUIFactory.teach() instanceof Teachers);
    }

    @Test
    void help() {
        MacGUIFactory macGUIFactory = new MacGUIFactory();
        Assertions.assertTrue(macGUIFactory.help() instanceof Staff);
    }
}