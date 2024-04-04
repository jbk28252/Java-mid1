package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        //코드작성
        String[] fruit = fruits.split(",");
        for(int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

        String fruits1 = String.join("->",fruit);
        System.out.println("joinedString = " + fruits1);
    }
}
