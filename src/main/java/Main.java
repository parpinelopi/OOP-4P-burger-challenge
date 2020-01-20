public class Main {
    public static void main(String[] args) {


    }
}

class BaseBurger {
    private int whiteBread;
    private int meat;
    private int basePrice;
    private boolean baseAdditionalItem;
    private int lettuce;
    private int tomato;
    private int pickle;
    private int onion;

    public BaseBurger(int whiteBread, int meat, int basePrice) {
        this.whiteBread = 12;
        this.meat = 18;
        this.basePrice = this.whiteBread + this.meat;
        baseAdditionalItem = false;

    }

    public int calculateBasePrice(int basePrice) {
        lettuce = 8;
        tomato = 7;
        pickle = 9;
        onion = 11;
        int addBaseItem = 0;

        if (baseAdditionalItem == true) {

            if (addBaseItem == lettuce) {
                addBaseItem += lettuce;
            }
            if (addBaseItem == tomato) {
                addBaseItem += tomato;
            }
            if (addBaseItem == pickle) {
                addBaseItem += pickle;
            }
            if (addBaseItem == onion) {
                addBaseItem += onion;
            }
            basePrice = basePrice +addBaseItem;
        }else {
            basePrice= this.whiteBread+this.meat;
        }
      return basePrice;
    }

}
//method to calculate the price

}

class HealthyBurger extends BaseBurger {
    private int darkBread;
    private int mustard;
    private int tofu;
    private int healthyPrice;
    private boolean healthyAdditionalItem;

    public HealthyBurger(int darkBread, int healthyPrice) {

        this.darkBread = 15;
        this.healthyPrice = this.darkBread + super.meat;//
        healthyAdditionalItem = false;
    }

    public int calculateHealthyPrice(int healthyPrice) {
        mustard = 13;
        tofu = 19;
        int addHealthyItem = 0;

        if (healthyAdditionalItem == true) {
            if (addHealthyItem == mustard) {
                addHealthyItem += mustard;
            }
            if (addHealthyItem == tofu) {
                addHealthyItem += tofu;
            }
        }

        healthyPrice = healthyPrice + addHealthyItem;


    }

}
}


class DeluxeBurger extends BaseBurger {
    private int chips;
    private int drinks;
    private int deluxePrice;
    //prevent any other additions, meaning that only bread and meat can be added or the base as it is and no other additional item
    //deluxe burger is a composition of the base burger and the chips and drinks


    public DeluxeBurger(int chips, int drinks, int deluxePrice) {
        this.chips = 20;
        this.drinks = 100;
        this.deluxePrice = deluxePrice;

    }

    public int calculateDeluxePrice (int deluxePrice){

        deluxePrice=this.chips + this.drinks + BaseBurger.calculateBasePrice();


    }
}