package encapsulating_Data;

public class Course {
    private int countStudents;
    public int getCountStudents() { // also called accessor
        return countStudents;
    }
    public void setCountStudents(int countStudents) { // also called mutator
        if(countStudents >= 0) // mənfi say qəbul edilməsinin qarşısını almaq
            this.countStudents = countStudents;
    }
}
