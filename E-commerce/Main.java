import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(104, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Backpack", "Accessories")
        };

        // Linear Search (Unsorted)
        Product foundLinear = SearchEngine.linearSearch(products, 102);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not found"));

        // Sort array by productId for Binary Search
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        // Binary Search (Sorted)
        Product foundBinary = SearchEngine.binarySearch(products, 102);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}
