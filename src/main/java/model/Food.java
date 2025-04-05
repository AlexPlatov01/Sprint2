package model;

public abstract class Food implements Discountable{
    protected int amount;  //  количество продукта в килограммах
    protected double price;   //цена за единицу
    protected boolean isVegetarian;  //флаг, который показывает, вегетарианский ли продукт


    protected Food(int amount, double price, boolean isVegetarian){// исправил на protected
        this.amount=amount;
        this.price=price;
        this.isVegetarian=isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian){
        this.isVegetarian=isVegetarian;
    }// is убрал.
}


