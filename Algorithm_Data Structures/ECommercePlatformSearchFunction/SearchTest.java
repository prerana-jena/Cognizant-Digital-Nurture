package ECommercePlatformSearchFunction;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Phone", "Mobiles"),
                new Product(105, "Tablet", "Electronics")
        };

        Product linearResult = Search.linearSearch(products, "Mouse");

        System.out.println("Linear Search:");
        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product Not Found.");

        Product binaryResult = Search.binarySearch(products, "Mouse");

        System.out.println("\nBinary Search:");
        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product Not Found.");
    }
}