package Homework1;

public class User extends Basket {
    private String login;
    private String password;
    protected Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

}
