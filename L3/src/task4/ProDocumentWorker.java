package task4;

public class ProDocumentWorker extends DocumentWorker {
    public ProDocumentWorker() {
        super("noPrint");
        System.out.println("Pro-version is available for you!");
    }
    public ProDocumentWorker(String noPrint) {
        super("noPrint");
    }


    @Override
    void editDocument() {
        System.out.println("The document is edited");
    }

    @Override
    void saveDocument() {
        System.out.println("The document is saved in old format. Saving in other formats is available in Expert-version");
    }
}
