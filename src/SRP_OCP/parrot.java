package SRP_OCP;

public class parrot extends Bird {

    parrot(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType);
    }

    void fly()
    {
        System.out.println("Fly like a parrot ");
    }

}
