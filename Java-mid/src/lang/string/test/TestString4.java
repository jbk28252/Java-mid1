package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        //코드 작성
        String extName = str.substring(5);
        String fileName = str.substring(0,5);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
