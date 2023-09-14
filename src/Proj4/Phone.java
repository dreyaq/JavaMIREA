package Proj4;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "");
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправить сообщение на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "iPhone 13", 0.2);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight() + " кг");

        System.out.println("\nТелефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight() + " кг");

        System.out.println("\nТелефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight() + " кг");

        phone1.receiveCall("Анна");
        phone2.receiveCall("Иван");
        phone2.receiveCall("Мария", "555-555-555");
        phone3.receiveCall("Петр");

        phone1.sendMessage("111-111-111", "222-222-222");
        phone2.sendMessage("333-333-333", "444-444-444", "555-555-555");
    }
}