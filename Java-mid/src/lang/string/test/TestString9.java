package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        //코드 작성
        String[] ID = email.split("@");
        System.out.println("ID: " + ID[0]);
        System.out.println("Domain: " + ID[1]);
    }
}
