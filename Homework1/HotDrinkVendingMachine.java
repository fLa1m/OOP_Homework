package Homework1;

import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {
    private LinkedList<HotDrink> drinks;

    @Override
    public HotDrink getProduct() {
        return drinks.pollLast();
    }

    @Override
    public void putProduct() {
    }

    public void putProduct(LinkedList<HotDrink> item) {
        this.drinks = item;
    }

}
