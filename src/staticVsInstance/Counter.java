package staticVsInstance;
/*Static və instance dəyişənlərə dəyər mənimsədilməyibsə, avtomatik olaraq default dəyərlər
mənimsədilir:*/
public class Counter {

    private static int count;
    private int count1;
    public Counter() {
        count++;
        count1++;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(count); // 1
        c1.test();
    }
    public void test() {
        Counter c2 = new Counter();
        System.out.println(count); // 2
        System.out.println(count1); // 1
        Counter c3 = new Counter();
        System.out.println(count); // 3
        System.out.println(count1); // 1
    }
}
