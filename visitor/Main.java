package visitor;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        for (int i = 0; i < 10; i++) {
            pokemon.attack();
            pokemon.heal();
            pokemon.block();
            System.out.println("XP: " + pokemon.getXp());
        }
    }

}
