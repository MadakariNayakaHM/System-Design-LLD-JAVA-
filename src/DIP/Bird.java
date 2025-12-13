
//class GlidingBehaviour {
//    void fly() {
//        System.out.println("Gliding in the sky...");
//    }
//}
//
//class Eagle {
//    private GlidingBehaviour behaviour = new GlidingBehaviour(); // ❌ depends on concrete class
//
//    public void fly() {
//        behaviour.fly();
//    }
//}

package DIP;

public class Bird {

    FlyingBehaviour flyingBehaviour;
    String Weight;
    String Colour;
    String type;
    String Size;
    String BeakType;

    Bird(String weight, String Colour, String type, String Size, String BeakType, FlyingBehaviour flyingBehaviour)
    {
        this.Weight = weight;
        this.BeakType = BeakType;
        this.Colour = Colour;
        this.type = type;
        this.Size = Size;
        this.flyingBehaviour = flyingBehaviour;
    }


    public void performFly() {
        flyingBehaviour.fly();
    }
}
