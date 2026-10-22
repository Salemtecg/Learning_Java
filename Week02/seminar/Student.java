

public class Student {

    private String name;
    private String lastName;
    private int ID;
    private Course[] courses;
    private int numOfCourses;

    

    public Student (String name, String lastName, int ID){
        this.name=name;
        this.lastName=lastName;
        this.ID=ID;

        this.courses = new Course[6];
        this.numOfCourses = 0;
    }  
    
    public String getName() {
        return name;
    }

    public void getCourses() {
        for (Course c : courses) {
            if(c != null){
                System.out.println(c.getTitle());
            }

            
        }
        

    }


    


    
    // nje student mund te kete vetem 6 kurse
    public boolean register(Course course){
        
        if(numOfCourses >= 6){
            System.out.println("You have already joined the max amount of courses");
            return false;
        }

        this.addCourse(course);
        course.addStudent(this);
        return true;
        
    }
    public void  addCourse(Course c){

        courses[numOfCourses++] = c;
       
    }

    
}
