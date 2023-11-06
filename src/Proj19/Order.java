package Proj19;

public class Order {
    public void processOrder(String fullName, String inn) throws InvalidInnException {
        if (isValidINN(inn)) {
            System.out.println("Заказ оформлен успешно для " + fullName);
        } else {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
    }

    private boolean isValidINN(String inn) {
        return inn != null && inn.matches("\\d{10}");
    }

    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.processOrder("Иванов Иван", "1234567890");
        } catch (InvalidInnException e) {
            System.err.println("Ошибка при оформлении заказа: " + e.getMessage());
        }
    }
}