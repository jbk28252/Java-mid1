package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.0"};

        double[] doubleArray = new double[array.length];
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            doubleArray[i] = Double.parseDouble(array[i]);
            sum += doubleArray[i];
        }
        System.out.println("sum = " + sum);
    }
}
