package Proj1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Egor", "Egor@example.com", 'm');
        System.out.println(author.toString());
        author.setEmail("none");
        System.out.println(author.toString());
    }
}
