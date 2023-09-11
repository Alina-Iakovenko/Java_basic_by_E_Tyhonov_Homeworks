package task3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Put the author: ");
        Author author = new Author(sc.nextLine());
        System.out.println("Put the title: ");
        Title title = new Title(sc.nextLine());
        System.out.println("Put the content: ");
        Content content = new Content(sc.nextLine());


        author.show();
        title.show();
        content.show();
    }
}
