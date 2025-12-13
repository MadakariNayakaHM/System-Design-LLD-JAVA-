package LSP.Voilation;

public class Penguine  extends Bird{

    Penguine(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType);
    }

    void fly() throws Exception {
        throw new Exception("Penguin can't fly");

    }
}
