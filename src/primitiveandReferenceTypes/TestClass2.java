package primitiveandReferenceTypes;

/*Əgər "most specific class" sayı bir deyil iki olarsa, onda nə baş verəcək? Yuxarıdakı kod
nümunəsini biraz fərqli şəkildə yazaq və nəticəyə baxaq:*/

public class TestClass2 {

    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(String s){
        System.out.println("String Version");
    }
    public void method(StringBuilder s){
        System.out.println("StringBuilder Version");
    }
    public static void main(String args[]){
        TestClass2 tc = new TestClass2();
      //  tc.method(null); // DOES NOT COMPILE
    }

}
