public class Customer {
    private String name;
    private String address;
    private String[] orderHistory;

    private int income;

    public Customer(String name, String address, String[] orderHistory, int income) {
        this.name = name;
        this.address = address;
        this.orderHistory = orderHistory;
        this.income = income;
    }


    public void processPayment(double amount) {
        this.income -= (int)amount;
    }
    public int getIncome() {return income;}

    public void setIncome(int income) {this.income = income;}

    public String getName() { return name;}
}
