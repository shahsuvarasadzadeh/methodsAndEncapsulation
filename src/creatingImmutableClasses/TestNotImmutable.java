package creatingImmutableClasses;

public class TestNotImmutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kitab");
        NotImmutable n = new NotImmutable(sb);
        sb.append(" bilik");
        StringBuilder builder = n.getBuilder();
        builder.append(" mənbəyidir");
        System.out.println(n.getBuilder()); // kitab bilik mənbəyidir
    }
}
