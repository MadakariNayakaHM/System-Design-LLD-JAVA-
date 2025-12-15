package Design_Patterns.Creational_DP.FactoryDP.AbstractFactory;

public class Main {
    static void main() {
        String type = "basicBread";
        String type1 = "basicBurger";
        String type2 = "wheatBread";
        String type3 = "wheatBurger";


        DominosFactory df = new DominosFactory();
        McFactory mf = new McFactory();

        Bread b1 = df.createBread(type2);
        b1.prepare();
        Bread b2 = mf.createBread(type);
        b2.prepare();
        Burger br1 = df.createBuger(type3);
        br1.prepare();
        Burger br2 = mf.createBuger(type1);
        br2.prepare();
    }
}
