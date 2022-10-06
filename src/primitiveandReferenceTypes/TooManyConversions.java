package primitiveandReferenceTypes;

public class TooManyConversions {
    // public static void play(Object o) {}
    public static void play(Long l) {
    }

    public static void play(Long... l) {
    }

    public static void main(String[] args) {
        //  play(4); // DOES NOT COMPILE
        play(4L); // calls the Long version
    }
    /*Yuxarıdakı nümunədə problem çevirmə ilə bağlıdır. Java int 4`ü long 4 və ya Integer 4`ə
rahatlıqla çevirir. Amma bir addıma int`i Long`a çevirə bilmir, gərək əvvəlcə int`i long`a
çevirsin, sonra da long`u Long`a, yəni iki addıma. İki çevirmə də mümkün deyil. Amma əgər
1-ci metodu kommentdən çıxarsaq, kod kompayl olunacaq. Çünki bu zaman ancaq bir
çevrilmə yerinə yetiriləcək: int`dən Integer`ə. Integer də obyekt olduğundan birinci metod
çağırılacaq.*/
}
