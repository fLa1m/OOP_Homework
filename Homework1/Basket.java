package Homework1;

import java.util.ArrayList;

public class Basket extends Shop {
    protected ArrayList<Product> productsInBasket;

    public Basket() {
        this.productsInBasket = new ArrayList<>();
    }

    public void addToBasket(ArrayList<Category> shopList, String _nameProduct) {
        ArrayList<Category> list = shopList;
        for (Category category : list) {
            for (int i = 0; i < category.productsList.size(); i++) {
                if (category.productsList.get(i).nameProduct.equals(_nameProduct)) {
                    this.productsInBasket.add(category.productsList.get(i));
                    category.productsList.remove(category.productsList.get(i));
                }
            }
        }
    }

    @Override
    public String toString() {
        return productsInBasket.toString();
    }

}
