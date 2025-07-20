import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists.");
            return;
        }
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product p = products.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Updated product: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        Product removed = products.remove(productId);
        if (removed != null) {
            System.out.println("Deleted product: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    // View All Products
    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
