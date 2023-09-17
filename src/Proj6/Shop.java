package Proj6;

public class Shop implements Printable{
    String name;
    String owner;

    public Shop(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void print() {
        System.out.println("Название магазина: " + name + ". Его владелец: " + owner);
    }
}
