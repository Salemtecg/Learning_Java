
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String adress;
    private List<Brantch> brantchs_list;

    public Bank (String name, String adress){
        this.name = name;
        this.adress = adress;
        this.brantchs_list = new ArrayList<Brantch>();
    }

    public void addBrantch(Brantch brantch){
        brantchs_list.add(brantch);

    }
    //print cdo id ne brantch list
    public void printBrantches(){
        for(Brantch b : brantchs_list){
            System.out.println(b.getId());
        }

    }
}


