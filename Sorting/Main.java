public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1001, "Alice", 3500.0),
            new Order(1002, "Bob", 1200.0),
            new Order(1003, "Charlie", 2500.0),
            new Order(1004, "Diana", 4300.0)
        };

        System.out.println("Original Orders:");
        SortUtil.printOrders(orders);

        // Using Bubble Sort
        System.out.println("\nSorted by Bubble Sort (by Total Price):");
        SortUtil.bubbleSort(orders);
        SortUtil.printOrders(orders);

        // Reinitialize for fresh sort
        orders = new Order[]{
            new Order(1001, "Alice", 3500.0),
            new Order(1002, "Bob", 1200.0),
            new Order(1003, "Charlie", 2500.0),
            new Order(1004, "Diana", 4300.0)
        };

        // Using Quick Sort
        System.out.println("\nSorted by Quick Sort (by Total Price):");
        SortUtil.quickSort(orders, 0, orders.length - 1);
        SortUtil.printOrders(orders);
    }
}
