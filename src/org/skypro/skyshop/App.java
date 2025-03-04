package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.Searchable; // Импорт интерфейса
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Создаем товары
        Product simpleProduct = new SimpleProduct("Яблоко", 50);
        Product discountedProduct = new DiscountedProduct("Банан", 100, 20);
        Product fixPriceProduct = new FixPriceProduct("Апельсин");

        Article article1 = new Article("Как выбрать яблоки", "Выбирайте свежие и сочные яблоки.");
        Article article2 = new Article("Польза бананов", "Бананы богаты калием и витаминами.");

        SearchEngine searchEngine = new SearchEngine(10);

        searchEngine.add(simpleProduct);
        searchEngine.add(discountedProduct);
        searchEngine.add(fixPriceProduct);
        searchEngine.add(article1);
        searchEngine.add(article2);

        System.out.println("Результаты поиска по запросу 'яблоко':");
        Searchable[] results = searchEngine.search("яблоко");
        System.out.println(Arrays.toString(results));

        System.out.println("Результаты поиска по запросу 'банан':");
        results = searchEngine.search("банан");
        System.out.println(Arrays.toString(results));

        System.out.println("Результаты поиска по запросу 'польза':");
        results = searchEngine.search("польза");
        System.out.println(Arrays.toString(results));

        ProductBasket basket = new ProductBasket();
        basket.addProduct(simpleProduct);
        basket.addProduct(discountedProduct);
        basket.addProduct(fixPriceProduct);

        System.out.println("Содержимое корзины:");
        basket.printBasket();
    }
}