package Homework1;

import java.util.ArrayList;

public class Category extends Shop {
    protected String categoryName;
    protected ArrayList<Product> productsList;

    public Category(String categoryName, Shop shop) {
        this.categoryName = categoryName;
        this.productsList = new ArrayList<>();
        shop.shopList.add(this);
    }

    public Category() {
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return productsList.toString();
    }

}
