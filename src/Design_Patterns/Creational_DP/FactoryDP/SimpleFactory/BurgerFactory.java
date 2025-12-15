package Design_Patterns.Creational_DP.FactoryDP.SimpleFactory;

public class BurgerFactory {

    public Burger createBurger(String type)
    {
        if(type.equals("basic"))
        {

            return new BasicBurger();
        } else if (type.equals("standard"))
        {
            return new Standard();
        }
        return new Premium();
    }
}
