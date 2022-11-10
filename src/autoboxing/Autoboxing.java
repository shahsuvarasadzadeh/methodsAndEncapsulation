package autoboxing;

public class Autoboxing {
    public  void fly(int i){
        System.out.println("Int  Qebul eden method cagrilir...");
    }
    public void fly(Integer i){
        System.out.println("Integer  Qebul eden method cagrilir...");

    }

    /*Əgər bizim int və Integer parametr qəbul edən metodlarımız varsa, fly(5); olaraq çağırsaq
1-ci metod işləyəcək, 1-ci metod olmasa, o zaman 2-ci metod çağırılacaq. Çünki java həmişə
ilk olaraq dəqiq uyğunluq olan parametri tapmağa çalışır. Əgər int parametrli metod
mövcuddursa, heç bir səbəb yoxdur ki, java int`i Integer`ə autoboxing edərək əlavə iş
görsün. Əgər Integer i = 5; elan edib i dəyişənini fly metoduna göndərsək o zaman 2-ci
metod işləyəcək.*/

    public static void main(String[] args) {

        //Double d1 = 50; // doesn't compile
        Double d2 = 50.0;
        double d3 = 50;
        Double d4 = 50.;

        Autoboxing a=new Autoboxing();
        Integer i=5;

        a.fly(i); // Integer  Qebul eden method cagrilir...

        a.fly(5); // Int  Qebul eden method cagrilir...
    }
}
