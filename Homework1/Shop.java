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

    protected Product selectProduct(String _nameProduct) {
        ArrayList<Category> list = this.shopList;
        for (Category category : list) {
            for (int i = 0; i < category.productsList.size(); i++) {
                if (category.productsList.get(i).nameProduct.equals(_nameProduct)) {
                    return category.productsList.get(i);
                }
            }
        }
        return null;
    }

}
