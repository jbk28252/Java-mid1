package Thread;

public class Test {

    public static void main(String[] args) {
        MyThreadRunnable obj = new MyThreadRunnable();
        Thread thread = new Thread(obj);

        thread.start();
    }
}
