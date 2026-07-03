package ECommercePlatformSearchFunction;

public class Search {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {

        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search (Array must be sorted by productName)
    public static Product binarySearch(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = products[mid].getProductName()
                    .compareToIgnoreCase(name);

            if (result == 0)
                return products[mid];

            if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}