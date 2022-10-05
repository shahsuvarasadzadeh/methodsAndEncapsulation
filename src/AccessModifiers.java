public class AccessModifiers {
    /**
     * public – metod public olarsa, istənilən classdan çağırıla bilər.
     *
     * private – metod private olarsa, ancaq classın öz daxilində çağırıla bilər.
     *
     * protected – metod protected olarsa, eyni paketdə olan classlar və subclasslar tərəfindən
     * çağırıla bilər.
     *
     * Default (Package Private) Access – metod default olarsa (yəni heç bir açar söz istifadə
     * edilməsə), ancaq eyni paketdə olan classlar tərəfindən çağırıla bilər*/

        public void test1() {}
        // default void test2(){}; // DOES NOT COMPILE
        // void public test3() {} // DOES NOT COMPILE
        void test4() {}


}
