public class Invoice {
    private String customer;
    private double amount;

    public Invoice(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCustomer() {
        return this.customer;
    }
}