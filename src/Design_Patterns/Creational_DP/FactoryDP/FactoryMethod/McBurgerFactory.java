package Design_Patterns.Creational_DP.FactoryDP.FactoryMethod;

public class McBurgerFactory extends BurgerFactory{

    @Override
    public Burger createBurger(String type) {

        if(type.equals("basic"))
        {
            return new Basic();
        }
        return null;
    }
}
