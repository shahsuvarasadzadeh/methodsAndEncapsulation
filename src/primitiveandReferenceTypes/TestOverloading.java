package primitiveandReferenceTypes;

public class TestOverloading {
    public static void main(String[] args) {
        System.out.print(glide());
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }

    public static String glide(String s) {
        return "1";
    }

    public static String glide(String... s) {
        return "2";
    }

    public static String glide(Object o) {
        return "3";
    }

    public static String glide(String s, String t) {
        return "4";
    }

    /**
     * Output:
     * 2142*/

    /*Varargs parametrli metoda boş parametr də göndərə bilərik, bu zaman java boş massiv
göndərir.
Java ən dəqiq uyğunluq olan parametri axtaran zaman ancaq bir çevirmə (one conversion)
edir.*/
}
