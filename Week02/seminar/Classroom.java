public class Classroom {
    public static final int LARGE_ROOM_THRESHOLD = 50;
    private final String roomNum;
    private final String building;
    private int capacity;
    private boolean  hasProjector;

    // THE CONSTRUCTOR, its job is to initialise the atributes
    public Classroom (String roomNum, String building, int capacity, boolean  hasProjector){
        this.capacity = capacity;
        this.roomNum = roomNum;
        this.building = building;
        this.hasProjector = hasProjector;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean  getHasProjector(){
        return hasProjector;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public boolean canAccomidate(int numOfStudents){

        return numOfStudents <= this.capacity;
    }

    public boolean isLargeRoom(){

        return this.capacity > LARGE_ROOM_THRESHOLD;

    }

    public String location(){

        return "Building: " + this.building + " ,Room: " + this.roomNum;
    }

    @Override
    public String toString() {

        return location() + " (" + this.capacity + " seats, projector: " + this.hasProjector + ")";
    }
}