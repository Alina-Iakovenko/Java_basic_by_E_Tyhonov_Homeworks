package task3;

public class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    void show() {
        System.out.println("Title: " + title);
    }
}
