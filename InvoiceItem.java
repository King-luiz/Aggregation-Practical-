public class InvoiceItem {
    // Attributes of the InvoiceItem class
    private String id;
    private String description;
    private int qty;
    private double unitPrice;

    // Constructor to initialize the invoice item
    public InvoiceItem(String id, String description, int qty, double unitPrice) {
        this.id = id;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for quantity 
    public int getQty() {
        return qty;
    }

    // Setter for quantity 
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter for unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total (qty * unitPrice)
    public double getTotal() {
        return qty * unitPrice;
    }

    // Overriding the toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "InvoiceItem [id=" + id + ", description=" + description + ", qty=" + qty + ", unitPrice=" + unitPrice + ", total=" + getTotal() + "]";
    }
}
