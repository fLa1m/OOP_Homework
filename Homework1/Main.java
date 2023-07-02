package Homework1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category fruits = new Category("Fruits", shop);
        Category drinks = new Category("Drinks", shop);

        Product apple = new Product("яблоко", 50.0, 5, fruits);
        Product banana = new Product("банан", 100.0, 5, fruits);
        Product pineapple = new Product("ананас", 500.0, 5, fruits);
        Product cola = new Product("cola", 60.0, 5, drinks);
        Product sprite = new Product("sprite", 55.0, 4, drinks);
        Product fanta = new Product("fanta", 40.0, 4, drinks);

        User usr1 = new User("park", "123");
        User usr2 = new User("park2", "321");
        System.out.println("Наличие магазина: ");
        System.out.println(shop.showShop());
        usr1.basket.addToBasket(shop.shopList, "яблоко");
        usr1.basket.addToBasket(shop.shopList, "cola");
        usr2.basket.addToBasket(shop.shopList, "sprite");
        usr2.basket.addToBasket(shop.shopList, "ананас");
        System.out.println("Покупки пользователя " + usr1.getLogin());
        System.out.println(usr1.basket);
        System.out.println("Покупки пользователя " + usr2.getLogin());
        System.out.println(usr2.basket);
        System.out.println("Остаток магазина:");
        System.out.println(shop.showShop());

    }
}
