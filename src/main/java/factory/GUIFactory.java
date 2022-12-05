package factory;

import interfaces.Staff;
import interfaces.Students;
import interfaces.Teachers;

public interface GUIFactory {

    Students study();
    Teachers teach();
    Staff help();
}
