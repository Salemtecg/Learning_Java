public class Departament {

    private final String name;
    private String building;
    private String headName;


    public Departament(String name, String building, String headName ){

        this.name = name;
        this.building = building;
        this.headName = headName;
    }

    public String getBuilding() {
        return building;
    }

    public String getName() {
        return name;
    }

    public String getHeadName() {
        return headName;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @Override
    public String toString() {
        return " Name : " + this.name + " Building is: " + this.building + " The heads name is: " + this.headName;
    }

    
}
