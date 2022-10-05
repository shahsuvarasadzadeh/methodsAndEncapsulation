package overloading_Methods;

public class OverloadingMethods {
    /**
     * Eyni ada, lakin müxtəlif parametr listinə (different method signature) sahib olan metodlar
     * overload metodlar adlanır. Signature`nin tərkibinə daxildir:
     * 1) metod adı;
     * 2) parametr siyahısı.
     * <p>
     * <p>
     * Overload metodlar əsasən parametr listinə görə təyin olunur, yəni bu metodlar üçün vacib
     * qayda budur ki, metod adı eyni olsun, parametr listi fərqli. Fərqli dedikdə nə nəzərdə
     * tutulur:
     * <p>
     * <p>
     *  parametrlərin sayı müxtəlif olmalıdır;
     *  parametrlərin sayı eyni ola bilər, o halda ki:
     * tipləri fərqli olmalıdır;
     * ardıcılıq fərqli olmalıdır.
     */

    public void fly(int i) {
    }

    public void fly(short s) {
    }

    public boolean fly() {
        return false;
    }

    void fly(int i, short s) {
    }

    public void fly(short s, int i) throws Exception {
    }

    // int fly(int i, short s) {return 0;} // doesn’t compile, for line 8

   // public static final void fly(short a, int b) {} // doesn’t compile, for line 9



    /**--------------------------------------------------------------*/

    /*Java varargs`la massiv kimi davranır. Əgər biz parametr olaraq int[] göndərsək, hansı metod
çalışacaq?*/

    public void fly(int[] array) {}
   // public void fly(int... varargs) {} // DOES NOT COMPILE

    /*2-ci metod kompayl olunmayacaq, çünki java bunların hər ikisi üçün metod signature`ni eyni
cür görür. Əgər ayrı-ayrılıqda kompayl olunsa, parametr olaraq massiv göndərilsə hər iki
metod çalışacaq. Yalnız varargs`ın çalışmasını istəyiriksə, massiv elementlərini tək-tək
göndəririk:*/

//    void fly(new int[] {1, 2, 3} ){}; // both of them
//    void  fly(1, 2, 3){}; // only varargs
}
