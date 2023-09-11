package task3;

public class Author {
    private final String author;

    public Author(String author) {
        this.author = author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    void show () {
        System.out.println("Author: " + author);
    }
}
