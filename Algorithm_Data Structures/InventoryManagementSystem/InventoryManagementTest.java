package InventoryManagementSystem;

public class InventoryManagementTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Mouse", 50, 700));
        inventory.addProduct(new Product(103, "Keyboard", 25, 1200));

        System.out.println("\nInventory:");
        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 40, 900);

        System.out.println("\nAfter Update:");
        inventory.displayProducts();

        inventory.deleteProduct(101);

        System.out.println("\nAfter Delete:");
        inventory.displayProducts();
    }
}