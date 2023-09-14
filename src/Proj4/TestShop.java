package Proj4;

public class TestShop {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Стул кухонный", 50.0, 4);
        Table table1 = new Table("Обеденный стол", 150.0, 6);
        Table table2 = new Table("Кофейный стол", 80.0, 2);

        FurnitureShop shop = new FurnitureShop(3);
        shop.addFurniture(chair1, 0);
        shop.addFurniture(table1, 1);
        shop.addFurniture(table2, 2);

        shop.displayInventory();
    }
}
