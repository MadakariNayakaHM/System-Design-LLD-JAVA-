package Design_Patterns.Creational_DP.FactoryDP.AbstractFactory;

public abstract  class MealsFactory {

    abstract Bread createBread(String type);

    abstract Burger createBuger(String type);
}
