package Proj6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] Books = new Book[5];
        Books[0] = new Book("1","2");
        Books[1] = new Book("2","3");
        Books[2] = new Book("3","4");
        Books[3] = new Book("5","6");
        Books[4] = new Book("7","8");
        for (int i = 0; i<Books.length;i++)
        {
            Books[i].print();
        }
    }
}
