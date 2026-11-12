public class University {

    public static void main(String[] args) {
        
        Classroom classroomA0 = new Classroom("A2", "2",  69, true); 
        System.out.println(classroomA0);
        System.out.println("The classroom " + classroomA0.getRoomNum() + (classroomA0.canAccomidate(50) ? " can " : " can't "  ) + "accomidate 50 people." );
        System.out.println("The classroom " + classroomA0.getRoomNum() + (classroomA0.isLargeRoom() ? " is " : " isn't ") + "a large room." );


        System.out.println("\n\n");

        Student studentA0 = new Student("34fghj", "mari", 2000);
        System.out.println(studentA0);
        System.out.println(studentA0.getCourseCount());
        studentA0.updateGpa(0.1);        
        System.out.println("The new gpa is :" + studentA0.getGpa() + " " + studentA0.academicStanding() );
        System.out.println("Student " + studentA0.getName() + " has been enroled for this many years : " + studentA0.yearsEnroled(2026));

        System.out.println("\n\n");

        Professor X = new Professor("EM12345678","X","Mind controll specialist",65);
        System.out.println(X);
        System.out.println(X.academicTitle() + " " + X.getName() + (X.isExperienced() ? " is ":" isn't ")+ " experienced.");
        X.completeOnotherYear();
        
        System.out.println("\n\n");

        Departament mind = new Departament("The mind contorl departament", "3", "Exavior");

        System.out.println(mind);

        System.out.println("\n\n");

        Course java = new Course("2345678", "Java", 5, "Fall semester 2026");
        System.out.println(java);
        System.out.println("Major?" + java.isMajorCourse());
    }
    
}
