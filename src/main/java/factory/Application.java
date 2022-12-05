package factory;

public class Application {
    private CreateUniversity university;

    public void createUniversity() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Unknown OS");
            return;
        }
        university = new CreateUniversity(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createUniversity();
    }
}
