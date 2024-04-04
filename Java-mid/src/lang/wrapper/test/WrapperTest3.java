package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer int1 = Integer.parseInt(str);
        int int2 = int1.intValue();
        Integer int3 = Integer.valueOf(int2);
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
    }
}
