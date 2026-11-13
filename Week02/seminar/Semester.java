public class Semester {

    private final String term;
    private final int year;

    public Semester(String term, int year){
        this.term = term;
        this.year = year;
    }
    @Override
    public String toString() {

        return term +" "+ year;
       
    }
    
}
