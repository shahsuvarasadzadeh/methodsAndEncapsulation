public class OptionalSpecifiers {
    /**
     * static, abstract, final – imtahan suallarında əsasən bunlar istifadə olunur;
     *
     * synchronized – OCA imtahanında yoxdu, ancaq OCP imtahanında istifadə olunur;
     *
     * native, strictfp – nə OCA, nə də OCP imtahanında istifadə olunmur.*/

    /*Access modifierdən fərqli olaraq bir metodda bir neçə “optional specifiers” istifadə etmək
mümkündür.*/

    public class Test {
        public void test1() {}
        public final void test2() {}
        public static final void test3() {}
        public final static void test4() {}
      //  public modifier void test5() {} // DOES NOT COMPILE
      //  public void final test6() {} // DOES NOT COMPILE
        final public void test7() {}
    }




}
