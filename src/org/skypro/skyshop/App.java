package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        // Создаем продукты
        Product product1 = new Product("Яблоко", 50);
        Product product2 = new Product("Банан", 30);
        Product product3 = new Product("Апельсин", 70);

        // Создаем корзину
        ProductBasket basket = new ProductBasket();

        // Добавляем продукты в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);

        // Пытаемся добавить продукт в заполненную корзину
        basket.addProduct(new Product("Груша", 60));
        basket.addProduct(new Product("Киви", 40));
        basket.addProduct(new Product("Манго", 100)); // Должно вывести сообщение о переполнении

        // Печать содержимого корзины
        System.out.println("Содержимое корзины:");
        basket.printBasket();

        // Получение общей стоимости корзины
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());

        // Поиск товара в корзине
        System.out.println("Есть ли в корзине Банан? " + basket.containsProduct("Банан"));
        System.out.println("Есть ли в корзине Манго? " + basket.containsProduct("Манго"));

        // Очистка корзины
        basket.clearBasket();
        System.out.println("Корзина после очистки:");
        basket.printBasket();

        // Получение стоимости пустой корзины
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalPrice());

        // Поиск товара в пустой корзине
        System.out.println("Есть ли в корзине Яблоко? " + basket.containsProduct("Яблоко"));
    }
}