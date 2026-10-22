package Week02.leksion;

public class BankApp {

    public static void main(String[] args){
        Account account01 = new Account("ACC-002", "ShqauMarina", 0.02);
        
        System.out.println(account01.getBalance());
        //account01.deposit();
        account01.withdraw(0.02);
        System.out.println(account01.toString());



    }
        
}
