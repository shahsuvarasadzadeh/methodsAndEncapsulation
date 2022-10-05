public class ReturnType {

    /*Metodun mütləq tipi olmalıdır, əgər metod geriyə heç bir dəyər qaytarmazsa, onun tipi
mütləq void yazılmalıdır, buraxıla bilməz. Əgər tip void olarsa, metoddan qayıdan dəyər kimi
return; ifadəsi yazılmasına icazə verilir, yaxud da ümumiyyətlə heç nə yazılmır.*/

    public void test1() {}
    public void test2() { return; }
    public String test3() { return ""; }
    // public String test4() {} // DOES NOT COMPILE
    // public test5() {} // DOES NOT COMPILE
    // String test6(int a) { if(a==4) return ""; } // DOES NOT COMPILE


    // Metoddan qayıdan dəyər metodun tipinə uyğun olmalıdır:
    int getInt() {
        return 9;
    }
   /* int getLong() {
        return 9L; // DOES NOT COMPILE
    }*/


}
