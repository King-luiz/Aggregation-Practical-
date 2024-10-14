
public class Accountdemo {
    public static void main(String[] args) {
        // Creating accounts using different constructors
        Account account1 = new Account("A001", "John Doe", 88); 
        Account account2 = new Account("A002", "Jane Doe",0);

        
        // Display account details
        System.out.println("Initial Account Details:");
        System.out.println(account1);
        System.out.println(account2);

        // Testing credit method
        System.out.println("\nCrediting 500 to account1...");
        account1.credit(500);
        System.out.println("Updated Account1 Balance: " + account1.getBalance());

        // Testing debit method
        System.out.println("\nDebiting 300 from account1...");
        boolean debitSuccess = account1.debit(300);
        if(debitSuccess) {
            System.out.println("Debit successful. Updated Account1 Balance: " + account1.getBalance());
        } else {
            System.out.println("Debit failed due to insufficient balance.");
        }

        // Testing transfer method
        System.out.println("\nTransferring 200 from account1 to account2...");
        boolean transferSuccess = account1.transfer(account2, 200);
        if(transferSuccess) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed due to insufficient balance.");
        }

        // Display updated account details after transfer
        System.out.println("\nUpdated Account Details:");
        System.out.println(account1);
        System.out.println(account2);
    }
}
