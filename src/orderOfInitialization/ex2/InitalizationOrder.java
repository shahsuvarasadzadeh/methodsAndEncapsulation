package orderOfInitialization.ex2;

public class InitalizationOrder {
    private String name = "Orxan";

    {
        System.out.println(name);
    }

    private static int count = 2;

    static {
        System.out.println(count);
    }

    {
        count++;
        System.out.println(count);
    }

    public InitalizationOrder() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Start main method");
        new InitalizationOrder();
    }

    /*Main metod static üzvlər (members) initialize olunduqdan sonra icra edilməyə başlayır.
Aşağıdakı nümunə nisbətən daha qəlizdir:*/


}
