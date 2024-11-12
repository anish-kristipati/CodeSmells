public class Product {
    private String name;
    private int length;
    private int width;
    private int height;
    private double price;
    private String manufacturerName;
    private String manufacturerAddress;

    public Product(String name, int length, int width, int height, double price, String manufacturerName, String manufacturerAddress) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.manufacturerAddress = manufacturerAddress;
    }

    public double getPrice() {
        return this.price;
    }    
}
