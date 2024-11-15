public class Runner {
    public static void main(String[] args) {
        // Instantiate the classes
        InventoryManager inventoryManager = new InventoryManager();
        OrderProcessor orderProcessor = new OrderProcessor();
        
        Manufacturer gadgets = new Manufacturer("Gadgets Inc", "123 Gadget Lane");
        Manufacturer watch = new Manufacturer("Watches Inc", "123 Watches Lane");

        Dimensions gadgetDimensions = new Dimensions(10, 5, 3);
        Dimensions watchDimensions = new Dimensions(1, 3, 2);

        Product product1 = new Product("Gadget", gadgetDimensions, 3.30, gadgets);
        Product product2 = new Product("Watch", watchDimensions, 5.30, watch);

        Customer customer = new Customer("John Doe", "123 Main St", new String[]{"Order1", "Order2"}, 100);

        LoginService loginService = new LoginService();
        User user = new User("Alice", "alice@example.com", "password123");

        // Inventory Management
        inventoryManager.manageInventory(new AddAction(), "Watch", 10);
        inventoryManager.manageInventory(new AddAction(), "Gadget", 50);
        inventoryManager.manageInventory(new AddAction(), "Lamp", 25);

        // Order Processing
        Order order = new Order("10");
        order.addProduct(product1);
        order.addProduct(product2);
        orderProcessor.processOrder(order, customer);

        // Login Service
        loginService.login(user);
        loginService.register(user);
        loginService.resetPassword(user);

        // Report Generation
        String inventoryReport = inventoryManager.generateInventoryReport();
        String salesReport = orderProcessor.generateSalesReport();

        // Output reports
        System.out.println(inventoryReport);
        System.out.println(salesReport);

        // Logout
        loginService.logout(user);
    }
}
