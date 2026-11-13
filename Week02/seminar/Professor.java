import java.util.ArrayList;
import java.util.List;

public class Professor {

    private final int MAX_COURSE_PER_PROF = 4;

    // empoyee id has to start with EM:
    private final String employeeId;
    private String name;
    private String specialisation;
    private int yearsOfExperiece;
    private final List<Course> courseList = new ArrayList<>();


    public Professor(String employeeID, String name, String specialisation, int yearsOfExperiece) {

        if(!(employeeID.charAt(0) == 'E' || employeeID.charAt(1)== 'M')){

            throw new IllegalArgumentException("Emloyee ID is incorrect");
        }

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

     public boolean assign(Course newCourse){
        //nuk mund te futeni ne  nje kurs qe eshte null

        if(newCourse==null){
            throw new NullPointerException("Proffessor cannot join a null course");
        }
        //you cannot join a course for the second time
        if(courseList.contains(newCourse)){
            return false;
        }
        //you cannot join more that 6 courses
        if(courseList.size()>=MAX_COURSE_PER_PROF){
            return false;
        }

        
        courseList.add(newCourse);
        return true;

    }

    public int totalTeachingCredits(){
        int sum = 0;
        for(Course c : courseList){
            sum += c.getCredits();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "ID: " + this.employeeId + " Name : " + this.name +" Specialisation is: " + this.specialisation + " Years of experience: " + this.yearsOfExperiece;
    }

    
}