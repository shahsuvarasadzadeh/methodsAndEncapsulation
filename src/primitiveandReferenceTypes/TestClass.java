package primitiveandReferenceTypes;

public class TestClass {
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        TestClass tc = new TestClass();
        tc.method(null);
    }

    /*
    *Sualdan da aydın göründüyü kimi hər üç metod null parametrini qəbul edir, bəs maraqlıdır
ki, kodu icra etsək hansı metod çalışacaq? Əvvəlki yazılarımızda da qeyd etdik ki, Java birinci
* ən dəqiq uyğunluğu (the most specific) axtarır. Bildiyimiz kimi FileNotFoundException classı
IOException classının subclassıdır, ona görə də bu nümunədə "the most specific class"
FileNotFoundException classı hesab edilir.
*/
}
