package callingStaticVariableOrMethod;

public class TigerTest {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println(Tiger.count); // 5
        // System.out.println(Tiger.age); // DOES NOT COMPILE
        System.out.println(t.count); // 5
        System.out.println(t.age); // 11
        t = null;
        System.out.println(t.count); // 5
       // System.out.println(t.age); // throws NullPointerException

        /*Static dəyişən classa aiddir və ona görə də fərqli obyektlər yaradıb, onların referansları
vasitəsilə bu dəyişənə dəyərlər versək, onlar hamısı eyni bir dəyişənin dəyərini dəyişəcək.
Aşağıdakı kod nümunəsi yuxarıdakı nümunənin davamıdır və koddan da göründüyü kimi
count dəyişəninin hansı obyekt üzərindən çağırılmasına baxmayaraq hamısı eyni bir
dəyişənin dəyərini dəyişir:*/

        Tiger.count = 4;
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        t1.count = 6;
        t2.count = 5;

        t1.age=12;
        t2.age=13;
        System.out.println(Tiger.count); // 5

        System.out.println(t1.age);

    }

}
