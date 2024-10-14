public class Account{
         String id;
         String name;
        int balance;

    //constructors
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //account1
    public Account(String id, String name){
        this(id, name, 0);
    }
    //account2
    public Account(String id){
        this(id, "", 0);
    }
    
    //getters
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
    
    //setters
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    //credit
    public void credit(int amount){
        balance += amount;
    }
    
    //debit
    public boolean debit(int amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
    
    //transfer
    public boolean transfer(Account toAccount, int amount){
        if(this.debit(amount)){
            toAccount.credit(amount);
            return true;
        }
        return false;
    }
    
    //toString method
    public String toString(){
        return "Account ID: " + id + "\nName: " + name + "\nBalance: " + balance;
    }


    
}