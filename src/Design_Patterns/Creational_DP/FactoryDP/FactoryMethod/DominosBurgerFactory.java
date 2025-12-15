package Design_Patterns.Creational_DP.FactoryDP.FactoryMethod;

public class DominosBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger(String type) {

        if(type.equals("basic"))
        {
            return new BasicWheat();
        }

        return null;
    }
}
