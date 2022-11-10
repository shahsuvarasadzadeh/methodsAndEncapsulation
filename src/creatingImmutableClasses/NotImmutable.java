package creatingImmutableClasses;

public class NotImmutable {
   /* Burada setter metodun gördüyü işi konstruktor görür. Obyekt yaradıldıqdan sonra (after
                          instantiation) isə dəyərlərin dəyişdirilməsi mümkün deyil. Amma mutable obyektlərlə
    diqqətli davranmaq lazımdı. Aşağıdakı nümunə ilə bunun səbəbini əsaslandırmağa çalışaq:*/

    private StringBuilder builder;
    public NotImmutable(StringBuilder b){
        builder = b;
    }
    public StringBuilder getBuilder(){
        return builder;
    }

}
