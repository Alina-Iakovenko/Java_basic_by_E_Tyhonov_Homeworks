package task3;

public class Content {
    private final String content;

    public Content(String content) {
        this.content = content;
    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    void show() {
        System.out.println("Content: " + content);
    }
}
