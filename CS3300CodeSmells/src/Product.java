public class Product {
    private String name;
    private int length;
    private int width;
    private int height;
    private double price;
    private Manufacturer manufacturer;

    public Product(String name, int length, int width, int height, double price, Manufacturer manufacturer) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return this.price;
    }    
}
