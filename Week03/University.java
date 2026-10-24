

public class University {

    public static void main(String[] args) {
        
        Student studentA = new Student("Marina", "Shqau", 2345);
        Course dataBaz = new Course("DB" , "Data bas", 6 , 1);
        
        
        studentA.register(dataBaz);
        dataBaz.register(studentA);

       studentA.getCourses();
        dataBaz.getStudents();
    }
    
}



