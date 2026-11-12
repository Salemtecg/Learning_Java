public class Professor {

    private final String employeeId;
    private String name;
    private String specialisation;
    private int yearsOfExperiece;

    public Professor(String employeeID, String name, String specialisation, int yearsOfExperiece) {
        this.employeeId = employeeID;
        this.name = name;
        this.specialisation = specialisation;
        this.yearsOfExperiece = yearsOfExperiece;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public int getYearsOfExperiece() {
        return yearsOfExperiece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String academicTitle() {
        if (this.yearsOfExperiece <= 5) {
            return "Asistant professor";
        } else if (this.yearsOfExperiece <= 10) {

            return "Asosiate porfessor";
        } else {
            return "Professor";
        }

    }

    public boolean isExperienced() {
     return yearsOfExperiece >= 6;
    }

    public void completeOnotherYear(){
        this.yearsOfExperiece++;
    }

    @Override
    public String toString() {
        return "ID: " + this.employeeId + " Name : " + this.name +" Specialisation is: " + this.specialisation + " Years of experience: " + this.yearsOfExperiece;
    }

    
}