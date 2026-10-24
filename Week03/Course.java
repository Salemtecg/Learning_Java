public class Course {

    private String code; 
    private String title; 
    private int ects; 
    private int simester; 
    private int numOfStudents;
    private Student[] students;

    public Course (String code, String title, int ects, int simester){
        this.code = code;
        this.title = title;
        this.ects = ects;
        this.simester = simester;

        this.numOfStudents = 0;
        this.students = new Student[100];

    }

    public String getTitle() {
        return title;
    }

    public void getStudents() {
         for (Student s : students) {
            if(s != null){
            
                System.out.println(s.getName());
            }
        }
    }
 
    
    

    public boolean register(Student student){
        
        if(this.numOfStudents >= 6){
            System.out.println("This student has already joined the max amount");
            return false;
        }

        this.addStudent(student);
        student.addCourse(this);
        return true;
        
    }
    public void addStudent(Student s){
    students[numOfStudents++] = s;

    }

}
