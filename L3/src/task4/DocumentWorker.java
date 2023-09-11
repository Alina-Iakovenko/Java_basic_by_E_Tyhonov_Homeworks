package task4;

public class DocumentWorker {
    public DocumentWorker() {
        System.out.println("Wellcome to DocumentWorker!");
    }
    public DocumentWorker(String noPrint) {}

    void openDocument() {
        System.out.println("The document is opened");
    }
    void editDocument() {
        System.out.println("Editing of a document is available in Pro-version");
    }
    void saveDocument() {
        System.out.println("Saving of a document is available in Pro-version");
    }
}
