package builder;

public interface IBurgerBuilder {

    void createBurger();

    void buildBun();

    void buildPatty();

    void buildCheese();

    Object getBurger();
}
