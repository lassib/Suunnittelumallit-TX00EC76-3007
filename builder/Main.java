package builder;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef();

        System.out.println("Making Hesburger burger:");
        IBurgerBuilder builder = new HesburgerBurgerBuilder();
        chef.setBuilder(builder);
        chef.constructBurger();
        HesburgerBurger hesburgerBurger = (HesburgerBurger) builder.getBurger();
        System.out.println(hesburgerBurger);

        System.out.println();

        System.out.println("Making McDonalds burger:");
        builder = new McDonaldsBurgerBuilder();
        chef.setBuilder(builder);
        chef.constructBurger();
        McDonaldsBurger mcDonaldsBurger = (McDonaldsBurger) builder.getBurger();
        System.out.println(mcDonaldsBurger);
    }
}
