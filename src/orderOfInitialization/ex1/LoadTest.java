package orderOfInitialization.ex1;

import orderOfInitialization.ex1.Child;

public class LoadTest {
    /*Order of Initialization
Ardıcıllıq:
1. Superclass (əgər varsa);
2. Static variable declarations and static initializers (faylda yerləşdiyi ardıcıllıqla);
3. Instance variable declarations and instance initializers (faylda yerləşdiyi ardıcıllıqla);
4. Constructor.*/

    public static void main(String[] args) {
        System.out.println("START");
        new Child();
        System.out.println("END");
    }

    /*Bu 4 qaydanın hamısı eyni zamanda ancaq o vaxt işləyir ki, classın obyekti yaradılmış olsun.
Əgər new açar sözündən istifadə edərək classa müraciət edilmirsə, ancaq 1-ci və 2-ci bənd icra
edilir. 3-cü və 4-cü bənd classın obyekti yaradılana qədər gözləməyə məcburdu, əks halda icra
edilmir. Çünki classın obyekti yaradılanda konstruktor çağırılır və yalnız konstruktor
çağırıldıqdan sonra instance dəyişən və bloklar initialize olunur (yaxud başladılır).*/
}
