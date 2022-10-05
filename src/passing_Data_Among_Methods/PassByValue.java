package passing_Data_Among_Methods;

import java.util.Arrays;

public class PassByValue {
    /*Java “pass by value” dildir. Yəni bu o deməkdir ki, dəyişənin kopyası yaradılır və metoda
parametr kimi həmin kopya göndərilir. Metod daxilində göndərilmiş həmin parametrin
dəyərinin dəyişdirilməsi (assignment) orijinal dəyərə (caller) təsir göstərmir.*/

    public static void main(String[] args) {
        int age = 29;
        String name = "Mushfiq";
        changeValues(age, name);
        System.out.println(name + " " + age); // Mushfiq 29
        main1();
    }
    public static void changeValues(int age, String name) {
        age = 23;
        name = "Murad";
    }
/**--------------------------------------------------------------*/

    /*Mutable obyekt dəyişənlərini metoda parametr olaraq göndərərkən diqqətli olmaq lazımdır.
String immutable dəyişəndir, ona görə də göndərilmiş metodda ona yeni dəyər
mənimsədilməsi onun orijinal dəyərini dəyişmir. StringBuilder ilə isə vəziyyət bir az
fərqlidir, nümunəyə baxaq:*/
    public static void main1() {
        StringBuilder name = new StringBuilder("Mushfiq");
        changeName(name);
        System.out.println(name); // Murad
    }
    public static void changeName(StringBuilder sb) {
        sb.delete(0, sb.length()).append("Murad");
    }

    /*Burada name referans dəyişəndir və sb də name dəyişəninin kopyasıdır və beləcə hər iki referans
eyni StringBuilder obyektinə işarə edir. Buna görə də sb referansından istifadə edərək
müvafiq metodları çağırmaqla həmin StringBuilder obyektinin dəyərini dəyişmək
mümkündür. Burada yenidən dəyər mənimsətmədən (reassign) söz gedə bilməz. Yenidən
dəyər mənimsətmə olarsa, o zaman orijinal dəyər yenə dəyişilməz olaraq qalır.*/


    /*** ---------------------------------------------------------------*/

    public static void main2(String[] args) {
        int[] arr = {1, 3, 5, 7};
        changeArray(arr);
        System.out.println(Arrays.toString(arr)); // [0, 4, 5, 7]
    }
    public static void changeArray(int[] arr) {
        arr[0] = 0;
        arr[1]++;
        arr = new int[4]; // line1
        arr[2] = 9;
    }

    /*Koddan göründüyü kimi line1 sətrində arr dəyişəninə yeni massiv mənimsədilir və bu
səbəbdən sonuncu sətirdə arr massivinin 2-ci indeksinə yeni dəyər mənimsədilsə də bu
original arr massivinə təsir etmir. Bütün bu yuxarıda qeyd etdiklərimizi yekunlaşdırıb qısaca
belə deyə bilərik ki, əgər metoda göndərilən parametr Object olarsa, bu zaman obyektin
referansının kopyası göndərilir və bu referans özündə obyektin heap yaddaşda mövcud
olduğu ünvanı (the address of the memory location) saxlayır. Həmin ünvan üzərindən artıq
eyni obyektə müraciət etmək mümkündür. Əgər metod daxilində referansa yeni dəyər
mənimsədilərsə, artıq yaddaş ünvanı dəyişir və ondan sonrakı müraciətlər original obyektə
təsir etmir.
*/

    }
