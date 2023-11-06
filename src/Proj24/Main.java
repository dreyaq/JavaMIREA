package Proj24;

public class Main {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorApplication editorApp = new EditorApplication(textDocumentFactory);

        editorApp.createNewDocument();
        editorApp.saveDocument();
        editorApp.exit();
    }
}
