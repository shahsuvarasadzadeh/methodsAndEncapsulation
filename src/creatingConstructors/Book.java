package creatingConstructors;

public class Book {

    /*Konstruktor class adı ilə eyni olan və geri dönüş tipi (return type) olmayan xüsusi metoddur.*/

  //  public book() {} // line1, DOES NOT COMPILE
    public void Book() {} // line2
     public Book() {} // line3
    public Book(Book b) {} // line4

    /**
     *  line1 – java case sensitive dildir və class adı eyni olmadığından bu konstruktor ola
     * bilməz. Java bunu normal metod kimi görür və geri dönüş tipi buraxıldığından
     * kompayl olunmur.
     *  line2 – normal metoddur, dönüş tipi olduğundan konstruktor ola bilməz.
     *  line3 – düzgün konstruktordur.
     *  line4 – düzgün konstruktordur, parametr olaraq özü ilə eyni olan tip qəbul edə bilər
     */


    /*Konstruktor həmçinin instance dəyişənlərə dəyər mənimsətmək üçün istifadə edilir. Bəzən
ola bilər ki, instance dəyişən adı ilə konstruktorun qəbul etdiyi parametrin adı eyni olsun.
Parametr lokal dəyişən hesab edildiyindən ilkin olaraq ona müraciət edilir. Əgər instance
dəyişəni lokal dəyişəndən fərqləndirmək istəyiriksə, o zaman instance dəyişənin adının
önündə this açar sözünü istifadə edirik:*/

    private String author;
    private int page;
    private int weight;
    public Book(int page, int theWeight) {
        //page = this.page; // dəyər dəyişilmir, yaxşı hal deyil
        weight = theWeight; // normaldır, çünki fərqli adlardır
        this.author = "Roel"; // normaldır, amma this artıqdır
        this.page = page; // ən çox istifadə edilən forma
    }
        public static void main(String[] args) {
            Book b = new Book(7, 2);
            System.out.printf("%d %d %s", b.page, b.weight, b.author); // 0 2 Roel
        }

        /*Konstruktorlara access modifier (public, private, protected) tətbiq edilə bilər. Amma
static, final, synchronized, native və abstract açar sözləri konstruktorlarla istifadə edilə
bilməz.*/


    /*Private konstruktor yaratmaqda məqsəd odur ki, kompilyator
classı default konstruktorla təmin etməsin. Belə olduqda başqa classlar tərəfindən bu classın
obyektinin yaradılmasının qarşısı alınır. Bu o zaman faydalı olur ki, ya class ancaq static
metodlara sahib olur, ya da class yeni instanslarının yaradılmasına özü nəzarət etmək istəyir.*/


    }
