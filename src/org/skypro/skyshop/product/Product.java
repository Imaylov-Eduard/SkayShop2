package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSearchTerm() {
        return name; // Поиск по имени товара
    }

    @Override
    public String getContentType() {
        return "PRODUCT"; // Тип контента
    }

    @Override
    public String getStringRepresentation() {
        return getName() + " — " + getContentType();
    }

    public abstract int getPrice();
}