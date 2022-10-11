package creatingImmutableClasses;

public class ImmutableCourse {
   /* Classı kənar müdaxilələrdən qorumağın digər üsulu isə həmin classı immutable etməkdir.
    Classı immutable etmək üçün birinci addım setter metodları ləğv etməkdir. Bu zaman sual
    yarana bilər ki, bəs əgər classı çağıran adamın (caller) spesifik dəyər təyin etməyi hələ də
    bacarmasını istəsək nə etməliyik? Bu zaman parametrli konstruktorlar köməyimizə gəlir.*/

    private int countStudents;
    public ImmutableCourse(int countStudents){
        this.countStudents = countStudents;
    }
    public int getCountStudents() {
        return countStudents;
    }
}
