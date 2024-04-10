package nested.anonymous.ex;

public class Ex0RefMain {

    public static void program(String name) {
        System.out.println("프로그램 시작");
        System.out.println("Hello" + name);
        System.out.println("프로그램 종료");
    }



    public static void helloJava() {
        program("Java");
    }

    public static void helloSpring() {
        program("Spring");
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
