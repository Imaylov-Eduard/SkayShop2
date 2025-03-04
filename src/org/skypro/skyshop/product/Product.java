package org.skypro.skyshop.product;

public class Product {
    private final String name; // Название продукта
    private final int price;   // Стоимость продукта

    // Конструктор для инициализации продукта
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Геттер для названия продукта
    public String getName() {
        return name;
    }

    // Геттер для стоимости продукта
    public int getPrice() {
        return price;
    }
}