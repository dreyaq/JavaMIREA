package Proj6;

public class Book implements Printable{

    String author;
    String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Автор книги: " + author + " Наименование: " + name);
    }
}
