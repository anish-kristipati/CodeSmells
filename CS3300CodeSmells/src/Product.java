public class Product {
    private String name;
    private Dimensions dimensions;
    private double price;
    private Manufacturer manufacturer;

    public Product(String name, Dimensions dimensions, double price, Manufacturer manufacturer) {
        this.name = name;
        this.dimensions = dimensions;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return this.price;
    }
    
    public int getLength() {
        return dimensions.getLength();
    }

    public int getWidth() {
        return dimensions.getWidth();
    }

    public int getHeight() {
        return dimensions.getHeight();
    }

    public int getVolume() {
        return this.dimensions.getVolume();
    }
}
