package orderOfInitialization.ex2;

public class YetMoreInitializationOrder {
    static {
        new YetMoreInitializationOrder();
    }

    static {
        add(4);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(3);
    }

    static {
        add(5);
    }

    {
        add(1);
    }

    {
        add(2);
    }

    public static void main(String[] args) {
        System.out.println("6");
    }
}
