package Week02.leksion;
//we defined the class
public class Account {
    //we defined the properities
    private String accountNumber;
    private String ownerName;
    private double balance;
     //we defined the constrictor
    public Account(String accountNumber,String ownerName, double balance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
        
    } 
    //defining methods for the class
    public boolean  deposit(double amount){
        if(amount<1){
            //System.out.println("Deposit must be at minimum 1$");
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean  withdraw(double amount){
       if(amount<1||amount>this.balance){
            //System.out.println("Withdrawl must be at minimum 1$");
            return false;
        }
        this.balance -= amount;

        return true;
    }

    //defining getters 

    public double getBalance(){

        return this.balance;

    }

    public String getaccountNumber(){
        return this.accountNumber;

    }

    public String getOwnername(){

        return this.ownerName;
    }

    //defining setters

    public void setOwnerName(String newName){
        this.ownerName = newName;

    }
    //overiding the to string method
    @Override 
    public String toString(){

        return "Account number: " + this.accountNumber + " Owend by: "  + this.ownerName + " With a balance of: " + this.balance;
    }
}
