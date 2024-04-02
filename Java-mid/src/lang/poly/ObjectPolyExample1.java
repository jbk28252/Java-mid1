package lang.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj.sound(); // 컴파일 오류 Object는 자식의 메서드를 모름!
        //obj.move(); // 컴파일 오류 Object는 자식의 메서드를 모름!

        //객체에 맞는 다운 캐스팅이 필요
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
