package DIP;

public class Flapping implements FlyingBehaviour{

    @Override
    public void fly() {
        System.out.println("Bird is Flapping");
    }
}
