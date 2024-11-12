import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    public String generateInventoryReport(InventoryManager inventoryManager) {
        Map<String, Integer> inventory = inventoryManager.getInventory();
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            report.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return report.toString();
    }

    public String generateSalesReport(OrderProcessor processor) {
        HashMap<Order, Customer> orders = processor.getOrders();
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
