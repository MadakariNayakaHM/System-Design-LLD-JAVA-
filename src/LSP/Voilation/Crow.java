package LSP.Voilation;

public class Crow extends Bird {

    Crow(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType);
    }

    void fly() throws Exception
    {
        System.out.println("Fly like a crow");
    }

}