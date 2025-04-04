package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food{

    private String colour;
    final int redAppleAmount = 10;
    final int redApplePrice = 50;

    public Apple(int amount, int price, String colour) {
        super( amount, price, true);
        this.colour = colour;
    }
    @Override
    public double getDiscount(){
        return  this.colour.equals(Colour.RED_COLOR) ? Discount.RED_APPLE_DISCOUNT : 0;// исправил на тернарный опретор
    }

    public String getColor() {
        return colour;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
}
