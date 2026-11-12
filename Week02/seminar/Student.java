import java.util.List;
import java.util.ArrayList;


public class Student {
    
    private final String studentID;
    private String name;
    private double gpa;
    private final int enrolmentYear;
    private final List<Course> courses = new ArrayList<>();

    public Student (String studentID, String name, int enrolmentYear){
        
        this.required(studentID, "StudentId cannot be empty");
        this.required(name, "Name cannot be empty");

        this.studentID = studentID;
        this.name = name;
        this. gpa = 0.0;

        if(enrolmentYear < 2000 || enrolmentYear > 2026){

            throw new IllegalArgumentException("Enrollment year is incorrect");

        }
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
        if(newGpa < 0.f || newGpa > 4.0 ){
            throw new IllegalArgumentException("Gpa is out of the norm");
        }
        this.gpa = newGpa;

    }
//TAKE A STRING VALUE AND THROW AN EXeption IF IT IS NULL OR EMTY
    private void required(String attribute, String error_message ){
        if(attribute == null || attribute.isBlank())
            throw new IllegalArgumentException(error_message);
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

    public int getCourseCount(){
        
        return courses.size();
    }

    @Override
    public String toString() {
       return "ID: " + this.studentID + " Name : " + this.name +" Gpa is: " + this.gpa + " Year of enrolment: " + this.enrolmentYear;
    }
    
}
