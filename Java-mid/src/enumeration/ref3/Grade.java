package enumeration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30),VIP(40);

    private final int discountParcent;

    Grade(int discountParcent) {
        this.discountParcent = discountParcent;
    }

    public int getDiscountParcent() {
        return discountParcent;
    }


    //추가
    public int discount(int price) {
        return price * discountParcent / 100 ;
    }
}
