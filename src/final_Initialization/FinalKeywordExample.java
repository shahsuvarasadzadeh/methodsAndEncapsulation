package final_Initialization;

import java.util.ArrayList;

public class FinalKeywordExample {
    final boolean bool; // line1
    static { System.out.println("static initializer"); }
    { System.out.println("instance initializer"); }
    FinalKeywordExample() {
        throw new RuntimeException(); // line2
    }
    public static void main1(String[] args) {
        FinalKeywordExample i = new FinalKeywordExample();
        System.out.println(i.bool);
    }

    /*Koddan da gördüyünüz kimi line1`də final bool dəyişəni yaradılıb və nə elan olunduğu
sətirdə, nə instance initializer blokda, nə də konstruktorda ona dəyər mənimsədilməyib.
Amma buna baxmayaraq kompayl xətası vermir. Xəta verməməsinin səbəbi isə line2`də
RuntimeException fırladılmasıdır. Əgər line2`ni kommentə salsaq, o zaman line1 kompayl
xətası verəcək və bool dəyişəninə dəyər mənimsədilməsi tələb ediləcək.*/

    /**---------------------------------------------*/

    /*Aşağıdakı nümunə sizi çaşdıra bilər. list və array referans dəyişənlərdir, yəni biz listə yeni
dəyər əlavə etdikdə, yaxud massivin müvafiq indeksindəki dəyərini başqa dəyərlə əvəz
etdikdə, bu final dəyişənə təkrar dəyər mənimsədilməsi hesab olunmur. Referans dəyişənə
yeni obyekt mənimsətdikdə artıq kompayl xətası baş verir:*/

    private static final ArrayList<String> list = new ArrayList<>();
    private static final int array[] = {1, 2};
    public static void main(String[] args) {
        list.add("changed");
        array[1] = 3;
        System.out.println(list.toString()+" -- "+array[1]);
       // list = new ArrayList<>(); // DOES NOT COMPILE
       // array = new int[]{4, 5}; // DOES NOT COMPILE
    }
}
