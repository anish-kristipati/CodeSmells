import java.util.HashMap;

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
        customer.setIncome((int) (customer.getIncome() - order.getTotalCost()));
    }

    private void addToOrders(Order order, Customer customer) {
        orders.put(order, customer);
    }

    public HashMap<Order,Customer> getOrders() { return orders;}
}
