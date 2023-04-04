package builder;

public class HesburgerBurgerBuilder implements IBurgerBuilder {

    private HesburgerBurger burger;
    private final StringBuilder burgerParts;

    public HesburgerBurgerBuilder() {
        burgerParts = new StringBuilder();
    }

    @Override
    public void createBurger() {
        burger = new HesburgerBurger();
    }

    @Override
    public void buildBun() {
        System.out.println("Oat bun added");
        burgerParts.append("Oat bun, ");
    }

    @Override
    public void buildPatty() {
        System.out.println("Chicken patty added");
        burgerParts.append("Chicken patty, ");
    }

    @Override
    public void buildCheese() {
        System.out.println("American cheese added");
        burgerParts.append("American cheese, ");
    }

    @Override
    public Object getBurger() {
        return new HesburgerBurger(burgerParts);
    }
}
