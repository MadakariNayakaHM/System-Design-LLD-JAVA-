package Design_Patterns.Creational_DP.FactoryDP.AbstractFactory;

public  class DominosFactory extends MealsFactory {

    @Override
    Bread createBread(String type) {
      if (type.equals("wheatBread")) {
            return new BasicWheatBread();

        }

        return null;
    }

    @Override
    Burger createBuger(String type) {

       if (type.equals("wheatBurger")) {
            return new BasicWheatBurger();

        }


        return null;
    }
}