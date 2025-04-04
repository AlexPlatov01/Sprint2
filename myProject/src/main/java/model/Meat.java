package model;

public class Meat extends Food implements Discountable{
    final int amountMeat = 5;
    final double priceMeat = 100;

    public Meat() {
        super(5, 100, false);
    }

    @Override
    public double getDiscount(){
        return 0;
    }

}

