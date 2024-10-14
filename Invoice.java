public class Invoice {
    public static void main(String[] args) {
        // Creating instance of InvoiceItem
        InvoiceItem item = new InvoiceItem("A101", "Laptop", 2, 999.99);

        // Test the getters
        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Unit Price: " + item.getUnitPrice());
        System.out.println("Total: " + item.getTotal());

        System.out.println(item.toString());
    }
}
