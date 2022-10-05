package autoboxing;

public class Autoboxing {
    public  void fly(int i){}
    public void fly(Integer i){}

    /*Əgər bizim int və Integer parametr qəbul edən metodlarımız varsa, fly(5); olaraq çağırsaq
1-ci metod işləyəcək, 1-ci metod olmasa, o zaman 2-ci metod çağırılacaq. Çünki java həmişə
ilk olaraq dəqiq uyğunluq olan parametri tapmağa çalışır. Əgər int parametrli metod
mövcuddursa, heç bir səbəb yoxdur ki, java int`i Integer`ə autoboxing edərək əlavə iş
görsün. Əgər Integer i = 5; elan edib i dəyişənini fly metoduna göndərsək o zaman 2-ci
metod işləyəcək.*/

    public static void main(String[] args) {
        Autoboxing a=new Autoboxing();
        a.fly(5);
    }
}
