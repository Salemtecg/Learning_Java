

public class Main {

    public static void main(String[] args) {
        Brantch b01 = new Brantch("idk ?");
        Brantch b02 = new Brantch("idk !");
        Brantch b03 = new Brantch("idk %");

        System.out.println(b01.getId());
        System.out.println(b02.getId());
        System.out.println(b03.getId());

        Bank bank = new Bank("IDK", "somewhere");

        bank.addBrantch(b01);
        bank.addBrantch(b02);
        bank.addBrantch(b03);

        bank.printBrantches();
    }

    
    
}
