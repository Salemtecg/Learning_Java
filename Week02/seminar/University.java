public class University {

    public static void main(String[] args) {
        
        Classroom classroomA0 = new Classroom("A2", "2",  69, true); 
        System.out.println(classroomA0);
        System.out.println("The classroom " + classroomA0.getRoomNum() + (classroomA0.canAccomidate(50) ? " can " : " can't "  ) + "accomidate 50 people." );
        System.out.println("The classroom " + classroomA0.getRoomNum() + (classroomA0.isLargeRoom() ? " is " : " isn't ") + "a large room." );


        System.out.println("\n\n");

        Student studentA0 = new Student("34fghj", "Mari", 2025);
        System.out.println(studentA0);
        studentA0.updateGpa(2.8);        
        System.out.println("The new gpa is :" + studentA0.getGpa() + " " + studentA0.academicStanding() );
        System.out.println("Student " + studentA0.getName() + " has been enroled for this many years : " + studentA0.yearsEnroled(2026));

        System.out.println("\n\n");

        Professor X = new Professor("34dfh","X","Mind controll specialist",65);
        System.out.println(X);
        System.out.println(X.academicTitle() + " " + X.getName() + (X.isExperienced() ? " is ":" isn't ")+ " experienced.");
        X.completeOnotherYear();
        
        System.out.println("\n\n");

        Departament mind = new Departament("The mind contorl departament", "3", "Exavior");

        System.out.println(mind);
    }
    
}
