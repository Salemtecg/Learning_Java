public class Course {

    private String courseCode;
    private String title;
    private int credits;
    private String semester;

    public Course(String courseCode, String title, int credits, String semester) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.semester = semester;

    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public String getSemester() {
        return semester;
    }

    public String fullName() {
        return "CS101: Introduction to Programming";
    }

    public boolean isMajorCourse() {
        return true;
    }

    @Override

    public String toString() {

        return "The courses code is: " + this.courseCode + " in the " + this.semester + " is a major course:"
                + this.isMajorCourse();
    }
}
