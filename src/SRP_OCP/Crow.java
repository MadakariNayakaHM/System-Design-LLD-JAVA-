package SRP_OCP;

public class Crow extends Bird{

    Crow(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType);
    }

    void fly()
    {
        System.out.println("Fly like a crow");
    }

}
