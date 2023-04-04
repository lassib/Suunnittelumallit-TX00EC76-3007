package builder;

import builder.burgerParts.Bun;
import builder.burgerParts.Cheese;
import builder.burgerParts.Patty;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBurgerBuilder implements IBurgerBuilder {

    private McDonaldsBurger burger;
    private final List<Object> burgerParts;

    public McDonaldsBurgerBuilder() {
        burgerParts = new ArrayList<>();
    }

    @Override
    public void createBurger() {
        burger = new McDonaldsBurger();
    }

    @Override
    public void buildBun() {
        burgerParts.add(new Bun("Wheat"));
    }

    @Override
    public void buildPatty() {
        burgerParts.add(new Patty("Beef"));
    }

    @Override
    public void buildCheese() {
        burgerParts.add(new Cheese("Cheddar"));
    }

    @Override
    public Object getBurger() {
        return new McDonaldsBurger(burgerParts);
    }
}
