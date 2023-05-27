/*1. Создать наследника реализованного класса ГорячийНапиток 
с дополнительным полем int температура. */

package Homework1;

public class HotDrink extends Product {

    protected Integer temperature;

    public HotDrink(String name, Integer price, Integer temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Integer getPrice() {
        return super.price;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setPrice(Integer price) {
        super.price = price;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + super.name + ", price=" + super.price + ", temperature=" + temperature + "]";
    }

}
