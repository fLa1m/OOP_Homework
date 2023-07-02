package Homework1;

public class Product extends Category {
    protected String nameProduct;
    protected Double price;
    protected Integer rank;

    public Product(String nameProduct, Double price, Integer rank, Category category) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rank = rank;
        category.productsList.add(this);
    }

    @Override
    public String toString() {
        return "{nameProduct=" + nameProduct + ", price=" + price + ", rank=" + rank
                + "}";
    }

}
