import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {

    private HashMap<Order, Customer> orders;

    public OrderProcessor() {
        this.orders = new HashMap<>();
    }
    public void processOrder(Order order, Customer customer) {
        if (validateOrder(order, customer)) {
            processPayment(order, customer);
            addToOrders(order, customer);
        }
    }

    private boolean validateOrder(Order order, Customer customer) {
        if (customer.getIncome() > order.getTotalCost()) return true;
        return false;
    }

    private void processPayment(Order order, Customer customer) {
       customer.processPayment(order.getTotalCost());
    }

    private void addToOrders(Order order, Customer customer) {
        orders.put(order, customer);
    }

    public HashMap<Order,Customer> getOrders() { return orders;}

    public String generateSalesReport() {

        StringBuilder report = new StringBuilder("Sales Report:\n");

        for (Map.Entry<Order, Customer> entry : orders.entrySet()) {
            Order order = entry.getKey();
            Customer customer = entry.getValue();
            report.append("Order ID: ").append(order.getId())
                    .append(", Customer: ").append(customer.getName())
                    .append(", Total Cost: ").append(order.getTotalCost())
                    .append("\n");
        }

        return report.toString();
    }
}
