public class WorkingWithVarargs {

    /*Vararg – variable argument. Massivə oxşayır, azacıq fərqlidir. Vararg parametr metodun
parametr listində ən sonda gəlməlidir və bir metodda ancaq bir vararg parametr istifadə edilə
bilər.*/

    public void test1(int... args) {}
    public void test2(int count, int... args) {}
   // public void test3(int... args, int args) {} // DOES NOT COMPILE
   // public void test4(int... count, int... args) {} // DOES NOT COMPILE
    // public void test5(int count, int args...) {} // DOES NOT COMPILE
     // public void test6(int count, int.. args) {} // DOES NOT COMPILE

    /*Vararg parametrli metodu çağırarkən bir neçə seçimimiz var:
    *
    * 1. Parametr olaraq massiv göndərə bilərik;
    * 2. Massivin elementlərini vergüllə ayrılmış şəkildə göndərə bilərik;
    * 3. Ümumiyyətlə parametr göndərməyə də bilərik. Bu zaman Java ölçüsü sıfır olan
 massiv yaradıb göndərir.
*/

    public static void test(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main1(String[] args) {
        test(1); // 0
        test(1, 2); // 1
        test(1, 2, 3); // 2
        test(1, new int[] {4, 5}); // 2
        test(1, new int[8]); // 8
        test(1, null); // throws NullPointerException
    }

//    Vararg parametrlərinə müraciət massivdəki kimidir, indeksdən istifadə olunur:

    public static void show(int... nums) {
        System.out.println(nums[1]); // 2
    }
    public static void main(String[] args) {
        show(1, 2);
    }



}
