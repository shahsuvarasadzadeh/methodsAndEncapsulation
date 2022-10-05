package final_Initialization;
/*final static dəyişənlərə dəyər mənimsədilə bilər:
1) elan olunduğu sətirdə;
2) static initializer blokda.
*
final instance dəyişənlərə dəyər mənimsədilə bilər:
1) elan olunduğu sətirdə;
2) instance initializer blokda;
3) konstruktorda.*/

public class Finals {

    /**  static final variables - sf */

    //  private static final int sf1; // DOES NOT COMPILE
    private static final int sf2 = 10;
    private static final int sf3;
    private static int s4;

    static {
        System.out.println(s4); // 0
        sf3 = 100;
    }

    /*** instance final variables - if */

     // private final int if1; // kompayl olunmur, bunun xətasını əslində konstruktorda göstərir
    private final int if2 = 20;
     private final int if3;
    private final int if4;
    private int i5;

    {
        if4 = 200;
       // if2 = 21; // DOES NOT COMPILE
    }

    public Finals() {
        System.out.println(i5); // 0
        if3 = 200;
    }

    /**-------------------------------------------------------*/

    public void method() {
        // local final variables
        final int a1;
        final int a2;
        final int a3; // unused
        int b1;
        int b2;
        int b3; // unused
       // System.out.println(a1); // DOES NOT COMPILE
        // System.out.println(b1); // DOES NOT COMPILE
        a2 = 30;
        System.out.println(a2);
        b2 = 3;
        System.out.println(b2);
        b2 = 300;
        System.out.println(b2);
        // a2 = 15; // DOES NOT COMPILE
    }

    /** Ətraflı bu linkdən baxa bilərsiniz:
     http://www.coderanch.com/t/640116/ocajp/certification/Final-instance-variable-initialization-behaviour#2937716*/
}



