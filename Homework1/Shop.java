package Homework1;

import java.util.ArrayList;

public class Shop {
    protected ArrayList<Category> shopList;

    public Shop() {
        this.shopList = new ArrayList<>();
    }

    public ArrayList<Category> showShop() {
        return shopList;
    }

    @Override
    public String toString() {
        return "Shop [shop=" + shopList + "]";
    }

}
