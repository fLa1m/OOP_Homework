package Homework1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine vending = new HotDrinkVendingMachine();
        HotDrink blackTea = new HotDrink("Черный чай", 100, 90);
        HotDrink greenTea = new HotDrink("Зеленый чай", 110, 80);
        HotDrink milk = new HotDrink("Молоко", 60, 50);
        LinkedList<HotDrink> list = new LinkedList<>();
        list.add(blackTea);
        list.add(greenTea);
        list.add(milk);
        vending.putProduct(list);
        System.out.println(vending.getProduct());
        System.out.println(vending.getProduct());
        System.out.println(vending.getProduct());
    }
}
