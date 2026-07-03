package InventoryManagementSystem;
import java.util.HashMap;
public class Inventory {
    private HashMap<Integer,Product> products=new HashMap<>();
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }
    public void updateProduct(int productId, String productName, double price, int quantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }
    public void deleteProduct(int productId) {
        Product removedProduct = products.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            System.out.println("Products in inventory:");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
}
