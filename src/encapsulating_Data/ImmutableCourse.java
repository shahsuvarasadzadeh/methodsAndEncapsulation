package encapsulating_Data;

public class ImmutableCourse {
    private int countStudents;
    public ImmutableCourse(int countStudents){
        this.countStudents = countStudents;
    }
    public int getCountStudents() {
        return countStudents;
    }
}
