import model.*;
import model.constants.Colour;
import service.*;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat();// Не понял по константам. Поменял у meat. Поменял у colour. Куда нести значения для красных и зеленых яблок я не понимаю.
        Apple redColor = new Apple(10, 50, Colour.RED_COLOR);
        Apple greenColor = new Apple(8, 60, Colour.GREEN_COLOR);


        Food[] products = new Food[]{meat, redColor, greenColor};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки:" + shoppingCart.amountNotDiscount());// принты поправил.
        System.out.printf("Общая сумма товаров со скидкой:" + shoppingCart.amountDiscount());
        System.out.printf("Сумма всех вегетерианских продуктов без скидки:" + shoppingCart.priceVegetarianNotDiscount());

//        for (int i = 0; i < 3; i++) {
//            double result = shoppingCart.amountNotDiscount();
//            System.out.println("Результат выова " + (i+1) + ": " + result);
//        }
    }
}
