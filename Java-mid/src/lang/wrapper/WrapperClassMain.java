package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerobj = Integer.valueOf(10); // -128 ~ 127 자수 사용하는 숫자 값 재사용, 불변
        Long longobj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerobj = " + integerobj);
        System.out.println("longobj = " + longobj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerobj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longobj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerobj));
        System.out.println("equals: " + (newInteger.equals(integerobj)));
    }
}
