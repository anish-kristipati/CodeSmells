import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private double totalCost;
    private String status;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
        this.status = "Created";
    }

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
    public String getId() { return orderId;}
}
