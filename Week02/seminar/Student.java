import java.util.List;
import java.util.ArrayList;


public class Student {
    
    private final int MAX_COURSE_PER_STUDENT = 6;

    private final String studentID;
    private String name;
    private double gpa;
    private final int enrolmentYear;
    private final List<Course> courseList = new ArrayList<>();
    

    public Student (String studentID, String name, int enrolmentYear){

        this.studentID = this.required(studentID, "StudentId cannot be empty");;
        this.name = this.required(name, "Name cannot be empty");;
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

    public List<Course> getCourseList() {
        return List.copyOf(courseList);
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
    private String required(String attribute, String error_message ){
        if(attribute == null || attribute.isBlank())
            throw new IllegalArgumentException(error_message);
        return attribute;
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

        return courseList.size();
    }

    public boolean register(Course newCourse){
        //nuk mund te futeni ne  nje kurs qe eshte null

        if(newCourse==null){
            throw new NullPointerException("Student cannot join a null course");
        }
        //you cannot join a course for the second time
        if(courseList.contains(newCourse)){
            return false;
        }
        //you cannot join more that 6 courses
        if(courseList.size()>=MAX_COURSE_PER_STUDENT){
            return false;
        }

        
        courseList.add(newCourse);
        return true;

    }

    public boolean hasCourse(String courseCode){
        for(Course c : courseList){
            if(c.getCourseCode().equals(courseCode))
                return true;
        }
        return false;
    }
    //we need to remove the course by its course code

    public boolean drop(String courseCode){
        for(int i= 0; i< courseList.size() ; i++){
            if(courseList.get(i).getCourseCode().equals(courseCode)){
                courseList.remove(i);
                return true;
            }
        }
        return false;
    }
    //we need to get the courses that the student is in and count the credits for each course and retun it 
    public int totalCredits(){
        int sum = 0;
        for(Course c : courseList){
            sum += c.getCredits();
        }
        return sum;
    }

    @Override
    public String toString() {
       return "ID: " + this.studentID + " Name : " + this.name +" Gpa is: " + this.gpa + " Year of enrolment: " + this.enrolmentYear;
    }
    
}
