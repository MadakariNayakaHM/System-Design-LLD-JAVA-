package Design_Patterns.Creational_DP.FactoryDP.SimpleFactory;

public class Main {

    static void main() {
        String type = "basic";

        BurgerFactory bf = new BurgerFactory();

        Burger burger = bf.createBurger(type);

        burger.prepare();


    }
}
