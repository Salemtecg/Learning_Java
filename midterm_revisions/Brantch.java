public class Brantch {
    private int id;
    private String adress;
    private static int avalible_id = 0;

    public Brantch(String adress){
        this.adress= adress;
        this.id = avalible_id;
        avalible_id ++;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }
     
    

}