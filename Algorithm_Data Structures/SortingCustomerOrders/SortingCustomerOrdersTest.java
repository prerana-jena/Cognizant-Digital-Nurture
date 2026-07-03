package SortingCustomerOrders;

public class SortingCustomerOrdersTest {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Rahul", 3500),
                new Order(102, "Anita", 1200),
                new Order(103, "Vikram", 5000),
                new Order(104, "Sneha", 2800)
        };

        System.out.println("Original Orders:");
        Sort.display(orders);

        Sort.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        Sort.display(orders);

        Order[] orders2 = {
                new Order(101, "Rahul", 3500),
                new Order(102, "Anita", 1200),
                new Order(103, "Vikram", 5000),
                new Order(104, "Sneha", 2800)
        };

        Sort.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        Sort.display(orders2);
    }
}