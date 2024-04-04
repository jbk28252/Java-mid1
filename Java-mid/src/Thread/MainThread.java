package Thread;

public class MainThread {
    public static void main(String[] args) {
        Thread www = Thread.currentThread(); //현재 메인에 들어있는 스레드

        System.out.println(www); // 스레드 출력
        System.out.println(www.getName()); // main 출력
    }
}
