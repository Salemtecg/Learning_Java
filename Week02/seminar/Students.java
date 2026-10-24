public class Students {
    
    private final String studentID;
    private String name;
    private double gpa;
    private final int enrolmentYear;

    public Students (String studentID, String name, int enrolmentYear){
        this.studentID = studentID;
        this.name = name;
        this. gpa = 0.0;
        this.enrolmentYear = enrolmentYear;

        
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateGpa(double newGpa){

        this.gpa = newGpa;

    }

    public String academicStanding(){

            if(this.gpa >= 2.0){
                return "Good standing";
            }else if (this.gpa >= 1.5) {
                return "Academic probation";
            }else {
                return "Warning";
            }
    }
    public int yearsEnroled(int currentYear){

        return currentYear - this.enrolmentYear;

    }

    @Override
    public String toString() {
       return "ID: " + this.studentID + " Name : " + this.name +" Gpa is: " + this.gpa + " Year of enrolment: " + this.enrolmentYear;
    }
    
}
