package Proj4;

class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        } else {
            System.out.println("Неверный индекс для добавления мебели.");
        }
    }

    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
                System.out.println();
            }
        }
    }
}