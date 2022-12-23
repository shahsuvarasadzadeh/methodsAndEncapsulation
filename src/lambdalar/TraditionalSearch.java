package lambdalar;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("peleng",false,true));
        animals.add(new Animal("Aslan",true,false));
        animals.add(new Animal("Bayqus",true,false));
        animals.add(new Animal("Serce",false,true));
        animals.add(new Animal("Tulku",true,true));

//        print(animals, new CheckIfHopper());
        print(animals,a->a.canHop());

       /* Kodu lambdas ilə əvəz etdiyimizə görə artıq bizə CheckIfHopper classı lazım olmayacaq. Plyus
        əgər biz üzməyi bacaran heyvanları seçmək istəsək əlavə class yaratmağa ehtiyac qalmayacaq,
                bir sətirlə biz bunu edə bilərik:*/
    }

    private static void print(List<Animal> animals,Checker checker){
        for (Animal animal:animals)
            if (checker.test(animal))
           System.out.println(animal);
    }
}
