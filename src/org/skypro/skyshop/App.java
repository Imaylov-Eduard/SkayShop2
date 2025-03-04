package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product product1 = new Product("Яблоко", 50);
        Product product2 = new Product("Банан", 30);
        Product product3 = new Product("Апельсин", 70);


        ProductBasket basket = new ProductBasket();


        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);


        basket.addProduct(new Product("Груша", 60));
        basket.addProduct(new Product("Киви", 40));
        basket.addProduct(new Product("Манго", 100)); // Должно вывести сообщение о переполнении


        System.out.println("Содержимое корзины:");
        basket.printBasket();


        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());


        System.out.println("Есть ли в корзине Банан? " + basket.containsProduct("Банан"));
        System.out.println("Есть ли в корзине Манго? " + basket.containsProduct("Манго"));


        basket.clearBasket();
        System.out.println("Корзина после очистки:");
        basket.printBasket();


        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalPrice());


        System.out.println("Есть ли в корзине Яблоко? " + basket.containsProduct("Яблоко"));
    }
}
