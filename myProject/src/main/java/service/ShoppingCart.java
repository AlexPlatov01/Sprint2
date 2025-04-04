package service;

import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    private Food [] foodBasket;

    public ShoppingCart(Food[] foodBasket){
        this.foodBasket = foodBasket;
    }
private double priceNotDiscount;
private double priceDiscount;
private double priceVegetarian;


public double amountNotDiscount(){
    priceNotDiscount = 0;
    for(int i = 0; i < foodBasket.length; i ++){
            priceNotDiscount=priceNotDiscount + foodBasket[i].getPrice() * foodBasket[i].getAmount();
    }
    return priceNotDiscount;
}
        public double amountDiscount(){
        priceDiscount=0;
            for (int i =0; i< foodBasket.length; i++){
                if(foodBasket[i].getDiscount() == 0) {
                    priceDiscount = priceDiscount + foodBasket[i].getPrice() * foodBasket[i].getAmount();
                }else {
                    priceDiscount = priceDiscount + (foodBasket[i].getPrice()*foodBasket[i].getAmount()) - (((foodBasket[i].getPrice()* foodBasket[i].getAmount()) * foodBasket[i].getDiscount())/100);// Использовал гетдискаунт.Переписал тут формулу.

                }
            }
            return priceDiscount;
        }

        public double priceVegetarianNotDiscount(){
        priceVegetarian=0;
            for (int i =0; i< foodBasket.length; i++){
                if (foodBasket[i].isVegetarian()){ // тут исправил.
                    priceVegetarian=priceVegetarian +foodBasket[i].getPrice() * foodBasket[i].getAmount();
                }
            }
            return priceVegetarian;
        }
    }
// по 1 пункту не понял, нужно дополнительно помимо того что есть еше метод который сложит мне amountNotDiscount и amountDiscount? 2. Запускал методы и по отдельности и вместе. Не понял что именно не так, результат то же.