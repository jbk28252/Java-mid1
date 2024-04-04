package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitivr -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토박싱


        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
