package lang.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 변환값 출력
        System.out.println(string);

        //object 직접출력
        System.out.println(object);
    }
}
