package builder;

public class Chef {

    private IBurgerBuilder builder;

    public void setBuilder(IBurgerBuilder builder) {
        this.builder = builder;
    }

    public void constructBurger() {
        builder.createBurger();
        builder.buildBun();
        builder.buildPatty();
        builder.buildCheese();
    }
}
