package lab2.task2;

public class TestBob {
    public static void main(String[] args) {
        Bob b = new Bob();
        b.setBobMood(new Grumpy());
        System.out.println(b);

        b.setBobMood(new Ok());
        System.out.println(b);

        b.setBobMood(new Happy());
        System.out.println(b);
    }
}
