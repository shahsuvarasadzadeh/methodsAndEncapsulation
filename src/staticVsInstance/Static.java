package staticVsInstance;
/**
 * • static member instance member`i birbaşa çağıra bilməz;
 * • instance metod static metodun daxilində yalnız classın instansı istifadə olunaraq
 * çağırıla bilər;
 * • static metodu class daxilində başqa bir static metodun içində class adı və ya instansı
 * olmadan çağırmaq mümkündür;
 * • instance metod class daxilində başqa bir instance metodun içində referans dəyişəni
 * istifadə olunmadan çağırıla bilər;
 * • static metod instance metodun daxilində çağırıla bilər.*/

public class Static {

    private String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    } // line1

    public static void main(String[] args) {
        first();
        second();
       // third(); // line2, DOES NOT COMPILE
        new Static().third(); // line3

        /*Instance metod line3`də göstərilən qaydada çağırılmalıdır. Əgər third() metodunu static
etsək, o zaman line2 kompayl olunacaq, amma line1`də kompayl xətası çıxacaq. Çünki name
dəyişəni static deyil və static metodda ancaq classın instansı istifadə olunaraq çağırıla bilər
ya da həmin dəyişən özü də static olmalıdır.*/


    }
}
