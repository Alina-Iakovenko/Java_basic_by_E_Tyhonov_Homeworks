package task2;

public class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("Document is opened");
    }

    @Override
    public void create() {
        System.out.println("Document is created");
    }

    @Override
    public void change() {
        System.out.println("Document is changed");
    }

    @Override
    public void save() {
        System.out.println("Document is saved");
    }
}
