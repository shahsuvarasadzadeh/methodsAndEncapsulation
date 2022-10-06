package primitiveandReferenceTypes;

/*int parametr qəbul edən metod həm char, həm də int tipini çağıra bilir. Amma char tipində
parametr qəbul edən metod int tipini çağıra bilmir. Aşağıdakı nümunəyə Enthuware
testlərində rast gələ bilərsiniz:*/

public class Noobs {
    public void m(int a) {
        System.out.println("In int ");
    } // line1

    public void m(char c) {
        System.out.println("In char ");
    } // line2

    public static void main(String[] args) {
        Noobs n = new Noobs();
        int a = 'a';
        char c = 6;
        n.m(a); // line3
        n.m(c); // line4
    }

    /*Əgər line2 kommentə alınsa kod normal işləyəcək, amma line1 kommentə alınsa line3
kompayl xətası verəcək.*/
}
