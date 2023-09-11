package task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    public ExpertDocumentWorker() {
        super("noPrint");
        System.out.println("Expert-version is available for you!");
    }

    @Override
    void saveDocument() {
        System.out.println("The document is saved in new format");
    }
}
