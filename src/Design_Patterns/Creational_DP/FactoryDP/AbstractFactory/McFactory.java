package Design_Patterns.Creational_DP.FactoryDP.AbstractFactory;

public class McFactory extends MealsFactory {

    @Override
    Bread createBread(String type) {

        if(type.equals("basicBread"))
        {
            return new BasicBread();
        }
        else
            return null;
    }

    @Override
    Burger createBuger(String type) {

        if(type.equals("basicBurger"))
        {
            return new BasicBurger();
        }
        else
            return null;
    }
}
