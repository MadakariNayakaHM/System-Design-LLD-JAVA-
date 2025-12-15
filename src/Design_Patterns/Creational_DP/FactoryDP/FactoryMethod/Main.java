package Design_Patterns.Creational_DP.FactoryDP.FactoryMethod;

public class Main {
    static void main() {
        String type = "basic";

        BurgerFactory dbf = new DominosBurgerFactory();
        BurgerFactory mbf = new McBurgerFactory();

        Burger db= dbf.createBurger(type);
        Burger mb= mbf.createBurger(type);

        db.prepare();
        mb.prepare();

    }
}
