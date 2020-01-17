public class Main {
    public static void main(String[] args) {

    }
}

class BaseBurger{
    private int whiteBread;
    private int meat;
    private int basePrice;
    private int BaseAdditionalItem;
    private int lettuce;
    private int tomato;
    private int pickle;
    private int onion;

    public BaseBurger(int whiteBread, int meat, int basePrice) {
        this.whiteBread = whiteBread;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    //method to calculate the price
    //switch statement for additional items and add to the final price
}

class HealthyBurger{
    private int darkBread;
    private int mustard;
    private int tofu;
    private int healthyPrice;
    private int healthyAdditionalItem;

    public HealthyBurger(int darkBread, int healthyPrice) {
        this.darkBread = darkBread;
        this.healthyPrice = healthyPrice;
    }
}


class DeluxeBurger{
    private int chips;
    private int drinks;
    private int deluxePrice;
    //prevent any other additions, meaning that only bread and meat can be added or the base as it is and no other additional item
    //deluxe burger is a composition of the base burger and the chips and drinks

}