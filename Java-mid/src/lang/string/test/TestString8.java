package lang.string.test;

public class TestString8 {

    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        //코드작성
        String output = input.replaceAll("java", "jvm");
        System.out.println(output);
    }
}
