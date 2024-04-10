package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void hello(Name name) {
        System.out.println("프로그램 시작");

        if(name.equals(name.Dice)){
            helloDice();
        } else if(name.equals(name.Sum)){
            helloSum();
        }

        System.out.println("프로그램 종료");
    }

    public static void helloDice() {


        //코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        //코드 조각 종료


    }

    public static void helloSum() {

        //코드 조각 시작
        for (int i = 0; i < 3; i++){
            System.out.println("i = " + i);
        }
        //코드 조각 종료
    }

    public static void main(String[] args) {
        hello(Name.Dice);
        hello(Name.Sum);
    }
}
