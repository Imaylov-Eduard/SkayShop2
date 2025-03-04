package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        // Создаем корзину
        ProductBasket basket = new ProductBasket();

        // Создаем товары разных типов
        SimpleProduct simpleProduct = new SimpleProduct("Яблоко", 50);
        DiscountedProduct discountedProduct = new DiscountedProduct("Банан", 100, 20); // Банан со скидкой 20%
        FixPriceProduct fixPriceProduct = new FixPriceProduct("Апельсин"); // Фиксированная цена 100

        // Добавляем товары в корзину
        basket.addProduct(simpleProduct);
        basket.addProduct(discountedProduct);
        basket.addProduct(fixPriceProduct);

        // Пытаемся добавить еще один товар (корзина рассчитана на 5 товаров)
        basket.addProduct(new SimpleProduct("Груша", 60));
        basket.addProduct(new DiscountedProduct("Киви", 80, 10));
        basket.addProduct(new FixPriceProduct("Манго")); // Должно вывести сообщение о переполнении корзины

        // Печать содержимого корзины
        System.out.println("Содержимое корзины:");
        basket.printBasket();

        // Получение общей стоимости корзины
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());

        // Поиск товара в корзине по имени
        System.out.println("Есть ли в корзине Банан? " + basket.containsProduct("Банан"));
        System.out.println("Есть ли в корзине Манго? " + basket.containsProduct("Манго"));

        // Очистка корзины
        basket.clearBasket();
        System.out.println("Корзина после очистки:");
        basket.printBasket();

        // Получение стоимости пустой корзины
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalPrice());

        // Поиск товара по имени в пустой корзине
        System.out.println("Есть ли в корзине Яблоко? " + basket.containsProduct("Яблоко"));
    }
}