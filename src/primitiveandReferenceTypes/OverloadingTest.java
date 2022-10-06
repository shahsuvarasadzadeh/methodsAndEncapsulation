package primitiveandReferenceTypes;


/*Qeyd etdiyimiz kimi birinci dəqiq uyğunluq tapılır, sonra digər etaplar nəzərdən keçirilir.
Aşağıdakı kod nümunəsində əgər bizim int parametr qəbul edən metodumuz olmasa, long
parametrli metod çağırılır, çünki daha geniş tipə malik parametrli metodu çağırmaq java üçün
problem deyil, amma əksi mümkün deyil, çünki java daha kiçik tipə avtomatik çevirmə etmir.*/

public class OverloadingTest {
    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        OverloadingTest obj = new OverloadingTest();
        obj.fly(123);
        obj.fly(123L);
        obj.fly((short) 123);
        obj.fly(123.0);

        /**
         * Output:
         * int long int object*/
    }
        /*Main metodda sonuncu sətirdə double tipli parametr göndəririk. İlk öncə double tipi axtarılır,
dəqiq uyğunluq tapılmadığına görə double autoboxing olaraq Double tipinə çevirilir. Və yenə
dəqiq uyğunluq tapılmadığına görə Object parametrli metod çağırılır.*/
}
