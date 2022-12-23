package lambdalar;

public class Animal {
    private String name;
    private boolean canSwim;
    private boolean canHop;


    public Animal(String name, boolean canSwim, boolean canHop) {
        this.name = name;
        this.canSwim = canSwim;
        this.canHop = canHop;
    }



    public String toString() {
        return name;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

}
