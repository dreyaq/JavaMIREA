package Proj24;

public class EditorApplication {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApplication(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        this.document = null;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        }
    }

    public void exit() {
        if (document != null) {
            document.close();
        }
    }
}

