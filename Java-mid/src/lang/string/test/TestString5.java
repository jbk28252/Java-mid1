package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        //코드 작성
        int extindex = str.indexOf(ext);
        String fileName = str.substring(0,extindex);
        String extName = str.substring(extindex,9);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
