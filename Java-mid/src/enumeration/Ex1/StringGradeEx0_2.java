package enumeration.Ex1;


public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //존재하지 않는 등급
        int vip = discountService.discount("VIP",price);
        System.out.println("VIP등급의 할인 금액 = " + vip);
        // 오타
        int diamondd = discountService.discount("DIAMONDD",price);
        System.out.println("DIAMONDD등급의 할인 금액 = " + diamondd);

        //소문자 입력


        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("gold", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }


}
