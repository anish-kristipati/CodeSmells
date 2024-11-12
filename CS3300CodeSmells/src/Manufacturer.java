public class Manufacturer {
    private String manufacturerName;
    private String manufacturerAddress;

    public Manufacturer(String manufacturerName, String manufacturerAddress) {
        this.manufacturerName = manufacturerName;   
        this.manufacturerAddress = manufacturerAddress; 
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public String getManufacturerAddress() {
        return manufacturerAddress;
    }
    
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
}
