package Proj6;

public class Cat implements Nameable{

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    void meow()
    {
        System.out.println("Meow");
    }
}
